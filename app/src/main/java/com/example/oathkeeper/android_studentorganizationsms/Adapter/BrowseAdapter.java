package com.example.oathkeeper.android_studentorganizationsms.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oathkeeper.android_studentorganizationsms.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BrowseAdapter extends RecyclerView.Adapter<BrowseAdapter.ViewHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private String[] mTitles;

    public BrowseAdapter(Context context) {
        mTitles = context.getResources().getStringArray(R.array.titles);
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.item_activities, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewEventName.setText(mTitles[position]);
    }



    @Override
    public int getItemCount() {
        return mTitles == null ? 0 : mTitles.length;
    }



    /**
     * This class contains all butterknife-injected Views & Layouts from layout file 'item_activities.xml'
     * for easy to all layout elements.
     *
     * @author ButterKnifeZelezny, plugin for Android Studio by Avast Developers (http://github.com/avast)
     */
    static class ViewHolder extends RecyclerView.ViewHolder{
        @Bind(R.id.textView_event_name)
        TextView textViewEventName;
        @Bind(R.id.textView_event_start_time)
        TextView textViewEventStartTime;
        @Bind(R.id.textView_event_end_time)
        TextView textViewEventEndTime;
        @Bind(R.id.textView_event_location)
        TextView textViewEventLocation;
        @Bind(R.id.textView_organization_duty)
        TextView textViewEvnetCategory;
        @Bind(R.id.textView_organization_number)
        TextView textView;
        @Bind(R.id.textView_detail)
        TextView textViewDetail;
        @Bind(R.id.button_attend)
        Button buttonAttend;
        @Bind(R.id.imageView)
        ImageView imageView;

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