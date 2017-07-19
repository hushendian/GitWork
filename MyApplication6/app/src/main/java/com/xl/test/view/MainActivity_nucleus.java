package com.xl.test.view;

import android.os.Bundle;
import android.widget.ImageView;

import com.xl.test.R;
import com.xl.test.presenter.NucleusPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import nucleus.factory.RequiresPresenter;
import nucleus.view.NucleusActivity;

/**
 * Created by hushendian on 2017/7/19.
 */
@RequiresPresenter(NucleusPresenter.class)
public class MainActivity_nucleus extends NucleusActivity<NucleusPresenter> {

    @BindView(R.id.splash_image)
    ImageView splashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }



}
