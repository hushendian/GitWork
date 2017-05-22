package glide.xl.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.test.R;

/**
 * Created by hushendian on 2017/5/8.
 */

public class TestActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }
}
