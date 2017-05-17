package com.xl.test.util;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xl.test.Model.County;
import com.xl.test.Model.Province;
import com.xl.test.gosn.Weather;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by hushendian on 2017/5/15.
 */

public class Utility {
    public static final String TAG = "Utility";
    private static Utility instance;
    private static Gson gson;

    public static Utility getInstance() {
        if (instance == null) {
            synchronized (Utility.class) {
                instance = new Utility();
            }
        }
        return instance;
    }

    public Utility() {
        gson = new Gson();
    }

    /**
     * 解析和处理服务器返回的省级数据
     *
     * @param response
     * @return
     */
    public static boolean handleProvienceResponse(String response) {
        Log.d(TAG, "handleProvienceResponse: " + response);
        if (!TextUtils.isEmpty(response)) {
            List<Province> list = gson.fromJson(response, new TypeToken<List<Province>>() {
            }.getType());
            Log.d(TAG, "handleProvienceResponse: " + list);
            for (Province province : list) {
                com.xl.test.db.Province province_db = new com.xl.test.db.Province();
                province_db.setProvienceName(province.getName());
                province_db.setProvienceCode(province.getId());
                province_db.save();
            }
            return true;
        }


        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     *
     * @param response
     * @return
     */
    public static boolean handleCityResponse(String response, int provinceId) {

        if (!TextUtils.isEmpty(response)) {
            List<Province> list = gson.fromJson(response, new TypeToken<List<Province>>() {
            }.getType());
            for (Province province : list) {
                com.xl.test.db.City province_db = new com.xl.test.db.City();
                province_db.setcityName(province.getName());
                province_db.setcityCode(province.getId());
                province_db.setProvinceId(provinceId);
                province_db.save();
            }
            return true;
        }


        return false;
    }


    /**
     * 解析和处理服务器返回的县级数据
     *
     * @param response
     * @return
     */
    public static boolean handleCountyResponse(String response, int CityId) {

        if (!TextUtils.isEmpty(response)) {
            List<County> list = gson.fromJson(response, new TypeToken<List<County>>() {
            }.getType());
            for (County province : list) {
                com.xl.test.db.County province_db = new com.xl.test.db.County();
                province_db.setcountyName(province.getName());
                province_db.setweatherId(province.getWeather_id());
                province_db.setcityId(CityId);
                province_db.save();
            }
            return true;
        }


        return false;
    }

    /**
     * 将返回的json数据解析成Weather实体类
     */
    public static Weather handlerWeatherPesponse(String response) {
        try {
            JSONObject jsonObject=new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getString(0).toString();
            return new Gson().fromJson(weatherContent, Weather.class);
        } catch (Exception e) {

        }


        return null;


    }

    ;


}