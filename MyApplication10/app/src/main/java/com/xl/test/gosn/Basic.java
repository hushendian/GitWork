package com.xl.test.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hushendian on 2017/5/16.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String id;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
