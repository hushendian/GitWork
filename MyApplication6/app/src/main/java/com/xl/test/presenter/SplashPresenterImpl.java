package com.xl.test.presenter;

import android.content.Context;
import android.view.animation.Animation;

import com.xl.test.model.SplashInteractorImpl;
import com.xl.test.view.SplashView;

/**
 * Created by hushendian on 2017/7/19.
 */

public class SplashPresenterImpl implements Presenter {

    Context mContext;
    SplashView mSplashView;
    SplashInteractorImpl mSplashInteractor;

    public SplashPresenterImpl(Context context, SplashView splashView) {
        if (null == splashView) {
            throw new IllegalArgumentException("Constructor's parameters must not be Null");
        }

        mContext = context;
        mSplashView = splashView;
        mSplashInteractor = new SplashInteractorImpl();
    }

    @Override
    public void initialized() {
        mSplashView.initView(mSplashInteractor.getBackgroundImageResID());
        Animation animation = mSplashInteractor.getBackgroudImageAnimation(mContext);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                mSplashView.navigateToHomePage();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        mSplashView.animateBackgroundImage(animation);
    }
}
