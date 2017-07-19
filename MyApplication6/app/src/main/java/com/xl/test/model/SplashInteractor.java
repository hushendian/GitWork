package com.xl.test.model;

import android.content.Context;
import android.view.animation.Animation;

/**
 * Created by hushendian on 2017/7/19.
 */

public interface SplashInteractor {
    int getBackgroundImageResID();

    Animation getBackgroudImageAnimation(Context context);
}
