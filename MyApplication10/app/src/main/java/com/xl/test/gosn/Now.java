package com.xl.test.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hushendian on 2017/5/16.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
