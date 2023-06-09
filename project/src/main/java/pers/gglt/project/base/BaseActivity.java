package pers.gglt.project.base;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean isSteepStatusBar = true; //沉浸状态栏
    private boolean mAllowFullScreen = true; //全屏
    private boolean isAllowScreenRotate = false; //旋转
    private View contextView = null; //当前Activity渲染的View
    protected final String TAG = this.getClass().getSimpleName();

    public abstract void bindLayout();
    public abstract void widgetClick(View v);
    public abstract void initView(final View view);
    public abstract void initParams(Bundle params);
    public abstract void doBusiness(Context context);
    public abstract void setListeners();
    public abstract void unsetListeners();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initParams(getIntent().getExtras());

        if (isSteepStatusBar) steepStatusBar();
        if (mAllowFullScreen) requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (!isAllowScreenRotate) setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bindLayout();
        initView(contextView);
        setListeners();
        doBusiness(this);
    }

    /**
     * [沉浸状态栏]
     */
    private void steepStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION); //透明导航栏
        }
    }

    /**
     * [绑定控件] *
     * @param resId *
     * @return
     */
    protected <T extends View> T $(int resId) {
        return (T) super.findViewById(resId);
    }

    @Override public void onClick(View v) {
        widgetClick(v);
    }

    /**
     * [页面跳转]
     * * @param clz
     */
    public void startActivity(Class<?> clz) {
        startActivity(new Intent(BaseActivity.this, clz));
    }

    /**
     * [携带数据的页面跳转]
     * * @param clz * @param bundle
     */
    public void startActivity(Class<?> clz, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(this, clz);
        if (bundle != null) {
            intent.putExtras(bundle);

        }
        startActivity(intent);
    }

    /** * [含有Bundle通过Class打开编辑界面]
     * * @param cls
     * @param bundle
     * @param requestCode
     */
    public void startActivityForResult(Class<?> cls, Bundle bundle, int requestCode) {
        Intent intent = new Intent();
        intent.setClass(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unsetListeners();
    }

    /**
     * [简化Toast]
     * @param msg
     */
    protected void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * [是否允许屏幕旋转] *
     * @param isAllowScreenRotate
     */
    public void setScreenRotate(boolean isAllowScreenRotate) {
        this.isAllowScreenRotate = isAllowScreenRotate;
    }


    /**
     * [是否允许全屏] *
     * @param allowFullScreen */
    public void setAllowFullScreen(boolean allowFullScreen) {
        this.mAllowFullScreen = allowFullScreen;
    }

    /**
     * [是否设置沉浸状态栏] *
     * @param isSetStatusBar
     */
    public void setSteepStatusBar(boolean isSetStatusBar) {
        this.isSteepStatusBar = isSetStatusBar;
    }
}