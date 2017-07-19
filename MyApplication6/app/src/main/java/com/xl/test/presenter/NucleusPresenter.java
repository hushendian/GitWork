package com.xl.test.presenter;

import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.xl.test.R;
import com.xl.test.view.MainActivity_nucleus;

import butterknife.BindView;
import nucleus.presenter.RxPresenter;

/**
 * Created by hushendian on 2017/7/19.
 */

public class NucleusPresenter extends RxPresenter<MainActivity_nucleus> {
    @BindView(R.id.splash_image)
    ImageView splashImage;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
//        new MainActivity_nucleus().showMessg();
        MainActivity_nucleus activity_nucleus = new MainActivity_nucleus();
//        MainActivity_nucleus activity_nucleus1 = getView();

        setImageSource(getResoureId());
//        Animation animation = getView().getAnimation();
//        animation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                getView().showMessg();
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });
//        getView().statrAnimation(animation);
//        getView().showMessg();


    }

//    public Animation getAnimation() {
//        return AnimationUtils.loadAnimation((Context) activity_nucleus, R.anim.splash);
//    }

    public int getResoureId() {
        return R.mipmap.morning;
    }

    public void setImageSource(int resourceId) {
        splashImage.setImageResource(resourceId);
    }

    public void statrAnimation(Animation animation) {
        splashImage.startAnimation(animation);
    }

    public void showMessg() {
        Log.d("MainActivity_nucleus", "showMessg: ");

    }
}
