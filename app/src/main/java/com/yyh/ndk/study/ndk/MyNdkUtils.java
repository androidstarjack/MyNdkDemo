package com.yyh.ndk.study.ndk;

/**
 * Created by Administrator on 2017/5/16/016.
 */

public class MyNdkUtils {
    public  native String getMyHelloFormWrold();
    {
        System.loadLibrary("myndkform");
    }
}
