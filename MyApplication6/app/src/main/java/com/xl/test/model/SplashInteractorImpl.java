package com.xl.test.model;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.xl.test.R;

/**
 * Created by hushendian on 2017/7/19.
 */

public class SplashInteractorImpl implements SplashInteractor {

    @Override
    public int getBackgroundImageResID() {
        return R.mipmap.morning;
    }

    @Override
    public Animation getBackgroudImageAnimation(Context context) {
        return AnimationUtils.loadAnimation(context, R.anim.splash);
    }
}
