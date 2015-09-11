package com.example.oathkeeper.android_studentorganizationsms.UI.Activity.Base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.oathkeeper.android_studentorganizationsms.MyApplication;

/**
 * Created by Oathkeeper on 2015/9/10.
 */

public class BaseActivity extends FragmentActivity  {

    protected static String TAG ;

    protected MyApplication mMyApplication;
    protected Context mContext;

    @Override
    protected void onCreate(Bundle bundle) {
        // TODO Auto-generated method stub
        super.onCreate(bundle);
        TAG = this.getClass().getSimpleName();
    }



    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }



}
