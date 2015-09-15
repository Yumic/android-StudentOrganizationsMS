package com.example.oathkeeper.android_studentorganizationsms.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oathkeeper.android_studentorganizationsms.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ManageAdapter extends RecyclerView.Adapter<ManageAdapter.ViewHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private String[] mTitles;

    public ManageAdapter(Context context) {
        mTitles = context.getResources().getStringArray(R.array.titles);
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.item_organizations, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return mTitles == null ? 0 : mTitles.length;
    }


    /**
     * This class contains all butterknife-injected Views & Layouts from layout file 'item_organizations.xml'
     * for easy to all layout elements.
     *
     * @author ButterKnifeZelezny, plugin for Android Studio by Avast Developers (http://github.com/avast)
     */
    static class ViewHolder extends RecyclerView.ViewHolder{
        @Bind(R.id.imageView)
        ImageView imageView;
        @Bind(R.id.textView_detail)
        TextView textViewDetail;
        @Bind(R.id.textView_organization_number)
        TextView textViewOrganizationNumber;
        @Bind(R.id.textView_organization_duty)
        TextView textViewOrganizationDuty;
        @Bind(R.id.textView_organization_name)
        TextView textViewOrganizationName;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("NormalTextViewHolder", "onClick--> position = " + getLayoutPosition());
                }
            });
        }
    }
}