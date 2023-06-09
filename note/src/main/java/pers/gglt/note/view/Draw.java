package pers.gglt.note.view;

// https://cloud.tencent.com/developer/beta/article/1945377?areaSource=103001.7&traceId=7M8r6Xga3-FvtPxA7kQcK
public class Draw {
    /**根布局*/
    // DecorView (界面窗口的根布局)(继承FrameLayout,从而继承ViewGroup)

    /**绘制流程*/
    /**入口 {@link #performTraversals()}*/
    // 从ViewRootImpl.performTraversals开始,从上到下遍历整个视图树,每个View控件负责绘制自己,而ViewGroup负责通知子View进行绘制操作
    // measure (测量大小)
    //      1.调用FrameLayout.onMeasure
    //      2.内部设置ViewGroup的宽高
    //      3.遍历子view,实现测量 (ViewGroup.measureChildWithMargins)
    //      4.子view自身测量,setMeasuredDimension,setMeasuredDimensionRaw (view.measure)
    // layout (确定位置)
    //      1.调用host.layout
    //      2.调用setFrame和onLayout
    //      3.onLayout遍历子view,调用其layout (若子view不是viewGroup其layout为空实现)
    // draw (绘制界面)
    //      1.ViewRootImpl.performDraw.draw.drawSoftware
    //      2.FrameLayout.draw
    //      3.View.draw.onDraw + dispatchDraw
    //          dispatchDraw遍历子view,调用view.drawChild.onDraw

    /**getWidth与getMeasuredWidth区别*/
    // 值 (一般相同)
    // 获取时机 (getMeasureWidth在measure后)(getWidth在layout后)

    /**窗口系统*/
    // PhoneWindow (每个Act创建一个)


    private void performTraversals() {
//      ...
//      int childWidthMeasureSpec = getRootMeasureSpec(mWidth, lp.width);
//      int childHeightMeasureSpec = getRootMeasureSpec(mHeight, lp.height);
//      ...
//      //执行测量流程
//      performMeasure(childWidthMeasureSpec, childHeightMeasureSpec);
//      ...
//      //执行布局流程
//      performLayout(lp, desiredWindowWidth, desiredWindowHeight);
//      ...
//      //执行绘制流程
//      performDraw();
    }
}
