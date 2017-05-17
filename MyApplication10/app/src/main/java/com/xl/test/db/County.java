package com.xl.test.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hushendian on 2017/5/15.
 */

public class County extends DataSupport {
    private  int id;
    private String  countyName;
    private  String weatherId;
    private  int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcountyName() {
        return countyName;
    }

    public void setcountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getweatherId() {
        return weatherId;
    }

    public void setweatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getcityId() {
        return cityId;
    }

    public void setcityId(int cityId) {
        this.cityId = cityId;
    }
}
