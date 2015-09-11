package com.example.oathkeeper.android_studentorganizationsms;

import android.app.Activity;
import android.app.Application;

import com.example.oathkeeper.android_studentorganizationsms.Bean.User;

/**
 * Created by Oathkeeper on 2015/9/10.
 */
public class MyApplication extends Application {

    public static String TAG;
    private static MyApplication myApplication = null;
    public static MyApplication getInstance(){
        return myApplication;
    }

    // TODO: 2015/9/10  获取当前登陆用户
    public void getCurrentUser() {


    }

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        TAG = this.getClass().getSimpleName();
        //由于Application类本身已经单例，所以直接按以下处理即可。
        myApplication = this;
    }




}
