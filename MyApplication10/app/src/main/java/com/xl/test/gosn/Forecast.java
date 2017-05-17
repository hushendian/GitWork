package com.xl.test.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hushendian on 2017/5/16.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature {
        public String max;
        public String min;
    }
}
