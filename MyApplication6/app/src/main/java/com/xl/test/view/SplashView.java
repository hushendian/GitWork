package com.xl.test.view;

import android.view.animation.Animation;

/**
 * Created by hushendian on 2017/7/19.
 */

public interface SplashView {

    void navigateToHomePage();

    void animateBackgroundImage(Animation animation);
    void initView(int resourceId);
}
