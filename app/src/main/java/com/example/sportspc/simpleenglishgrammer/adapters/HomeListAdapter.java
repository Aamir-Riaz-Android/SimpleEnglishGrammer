package com.example.sportspc.simpleenglishgrammer.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sportspc.simpleenglishgrammer.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SportsPc on 11/8/2017.
 */

public class HomeListAdapter extends BaseAdapter {
    List titleList=new ArrayList();
    Context mContext;

    public HomeListAdapter(Context context,List list){
        this.mContext=context;
        this.titleList=list;
    }
    @Override
    public int getCount() {
        return titleList.size();
    }

    @Override
    public String getItem(int position) {
        return titleList.get(position).toString();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater;
        ViewHolder holder;

        if(convertView==null){
            inflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.row_homelist_adapter,null);
            holder=new ViewHolder();
            holder.tvTitle=convertView.findViewById(R.id.tvTitle);
            convertView.setTag(holder);


        }
        else{
            holder=(ViewHolder) convertView.getTag();


        }
        holder.tvTitle.setText(getItem(position));

        return convertView;
    }
    private class ViewHolder{
        TextView tvTitle;
    }
}
