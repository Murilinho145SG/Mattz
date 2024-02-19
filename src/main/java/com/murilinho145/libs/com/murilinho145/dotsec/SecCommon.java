package com.murilinho145.libs.com.murilinho145.dotsec;

import java.net.URL;

public class SecCommon {
    public static String getPath() {
        ClassLoader classLoader = SecCommon.class.getClassLoader();
        URL relativePath = classLoader.getResource(".sec");
        if (relativePath != null) {
            return relativePath.getPath();
        } else {
            return "Error to find .sec in resources files";
        }
    }
}