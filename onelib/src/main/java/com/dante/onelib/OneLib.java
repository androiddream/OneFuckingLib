package com.dante.onelib;

import android.annotation.SuppressLint;
import android.content.Context;

/**
 * OneLib util
 */

public class OneLib {
    @SuppressLint("StaticFieldLeak")
    private static Context context;


    public static void init(Context context) {
        OneLib.context = context.getApplicationContext();
//        Utils.init(context);
    }
}
