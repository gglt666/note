package pers.gglt.project.gesture;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public abstract class MultiTouchListener implements OnTouchListener {
    private long multiTouchInterval; //连续触屏的最大间隔, 超过该间隔将视为一次新的 touch 开始
    private long lastTouchTime; //上次 onTouch 发生的时间
    private int touchCount;  //已经连续 touch 的次数

    public MultiTouchListener() {
        this(250);
    }

    public MultiTouchListener(long multiTouchInterval) {
        this.multiTouchInterval = multiTouchInterval;
        this.lastTouchTime = 0;
        this.touchCount = 0;
    }

    @Override
    public boolean onTouch(final View v, final MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            final long now = System.currentTimeMillis();
            this.lastTouchTime = now;

            synchronized (this) {
                this.touchCount++;
            }

            new Handler().postDelayed(() -> {
                // 两个变量相等, 表示时隔 multiTouchInterval 之后没有新的 touch 产生, 触发事件并重置 touchCount
                if (now == MultiTouchListener.this.lastTouchTime) {
                    synchronized (MultiTouchListener.this) {
                        MultiTouchListener.this.onMultiTouch(v, event, MultiTouchListener.this.touchCount);
                        MultiTouchListener.this.touchCount = 0;
                    }
                }
            }, MultiTouchListener.this.multiTouchInterval);
        }
        return true;
    }

    public abstract boolean onMultiTouch(View v, MotionEvent event, int touchCount);
}