package com.example.oathkeeper.android_studentorganizationsms.UI.Fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.oathkeeper.android_studentorganizationsms.MyApplication;
import com.example.oathkeeper.android_studentorganizationsms.R;

/**
 * Created by Oathkeeper on 2015/9/9.
 */
public class SettingFragment extends Fragment{
    // 存储上下文对象
    public Context context;
    public Activity activity;
    public MyApplication myApplication;
    public ListView mListView= null;


    /**
     * 初始化操作
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
        activity = getActivity();
        //通过MyApplication获取当前用户
        myApplication=MyApplication.getInstance();
    }

    //界面初始化
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_browse, container, false);

        //初始化ListView
        //mListView=(ListView) view.findViewById(R.id.listview);
        // mListView.setAdapter(adapter);

        return view;
    }
}
