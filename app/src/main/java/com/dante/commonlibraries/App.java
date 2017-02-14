package com.dante.commonlibraries;

import android.app.Application;

import com.dante.onelib.OneLib;

//import com.dante.onelib.OneLib;

/**
 * Custom application for app init.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        OneLib.init(this);
    }
}
