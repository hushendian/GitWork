package com.xl.test.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.Toast;

import com.xl.test.R;
import com.xl.test.presenter.Presenter;
import com.xl.test.presenter.SplashPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements SplashView {

    @BindView(R.id.splash_image)
    ImageView splashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Presenter presenter = new SplashPresenterImpl(this, this);
        presenter.initialized();
    }

    @Override
    public void navigateToHomePage() {
        Toast.makeText(this, "结束", 1).show();
    }

    @Override
    public void animateBackgroundImage(Animation animation) {
        splashImage.startAnimation(animation);
    }

    @Override
    public void initView(int resourceId) {
        splashImage.setImageResource(resourceId);
    }


}
