package com.example.sbs.myapplication;

import android.app.Application;

import com.example.sbs.myapplication.util.Util;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Util.init(this);
    }
}
