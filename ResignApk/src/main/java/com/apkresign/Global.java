package com.apkresign;

/**
 * Created by pengwei on 16/4/15.
 */
public interface Global {
    String VERSION = "1.2.3";

    String ABOUT_UEL = "https://github.com/sinlov/apkReSign";

    String LOCAL_HOST = System.getProperty("user.home") + "/.apkResign";

    String LOCAL_CONFIG_FILE = LOCAL_HOST + "/config.properties";
}
