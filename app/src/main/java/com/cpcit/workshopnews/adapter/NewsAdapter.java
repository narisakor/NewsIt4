package com.cpcit.workshopnews.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.cpcit.workshopnews.R;

import java.util.List;


public class NewsAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater = null;
    private List<String> data;

    public NewsAdapter(Activity activity, List<String> data) {
        this.activity = activity;
        inflater = (LayoutInflater) activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
    }

    public int getCount() {
        if (data == null)
            return 0;
        else
            return data.size();
    }

    public Object getItem(int position) {
        return data.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        TextView tvTitleNews;
        TextView tvPublishDate;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        final ViewHolder holder;
        if (convertView == null) {
            vi = inflater.inflate(R.layout.item_news, null, false);
            holder = new ViewHolder();
            holder.tvTitleNews = (TextView) vi.findViewById(R.id.tv_news_title);
            holder.tvPublishDate = (TextView) vi.findViewById(R.id.tv_publish_date);

            vi.setTag(holder);
        } else {
            holder = (ViewHolder) vi.getTag();
        }

        return vi;
    }
}