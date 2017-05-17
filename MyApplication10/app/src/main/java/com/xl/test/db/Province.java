package com.xl.test.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hushendian on 2017/5/15.
 */

public class Province extends DataSupport {
    private  int id;
    private String  provienceName;
    private  int provienceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvienceName() {
        return provienceName;
    }

    public void setProvienceName(String provienceName) {
        this.provienceName = provienceName;
    }

    public int getProvienceCode() {
        return provienceCode;
    }

    public void setProvienceCode(int provienceCode) {
        this.provienceCode = provienceCode;
    }
}
