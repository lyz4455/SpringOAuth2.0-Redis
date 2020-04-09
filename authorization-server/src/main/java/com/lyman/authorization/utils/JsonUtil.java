package com.lyman.authorization.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by lyz4455 on 2020/4/2.
 */
public class JsonUtil {
    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
