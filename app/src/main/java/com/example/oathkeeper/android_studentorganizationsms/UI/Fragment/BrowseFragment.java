package com.example.oathkeeper.android_studentorganizationsms.UI.Fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.oathkeeper.android_studentorganizationsms.Adapter.BrowseAdapter;
import com.example.oathkeeper.android_studentorganizationsms.MyApplication;
import com.example.oathkeeper.android_studentorganizationsms.R;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by Oathkeeper on 2015/9/9.
 */

public class BrowseFragment extends Fragment {

    // 存储上下文对象
    public Context context;
    public Activity activity;
    public MyApplication myApplication;
    public ListView mListView = null;

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;


    /**
     * 初始化操作
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
        activity = getActivity();
        //通过MyApplication获取当前用户
        myApplication = MyApplication.getInstance();
    }

    //界面初始化
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_browse, container, false);


        //初始化ListView
        //mListView=(ListView) view.findViewById(R.id.listview);
        // mListView.setAdapter(adapter);

        ButterKnife.bind(this, view);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));//这里用线性显示 类似于listview
//        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));//这里用线性宫格显示 类似于grid view
//        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL));//这里用线性宫格显示 类似于瀑布流
        recyclerView.setAdapter(new BrowseAdapter(context));

        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
