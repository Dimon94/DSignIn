package com.dimon.signin;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Dimon on 2016/4/11.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.NewsViewHolder> {

    private List<Image> images;
    private Context mContext;

    public MainAdapter(List<Image> images, Context context) {
        this.images = images;
        this.mContext = context;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_main, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder personViewHolder, int i) {

        switch(i){
            case 0:
                Glide.with(mContext)
                        .load("")
                        .placeholder(R.drawable.dog) //设置占位图
                        .crossFade() //设置淡入淡出效果，默认300ms，可以传参.crossFade() //设置淡入淡出效果，默认300ms，可以传参
                        .into(personViewHolder.meizhi);
                personViewHolder.news_title.setText("项目："+ "日常签到");
                personViewHolder.news_desc.setText("地址：" + "广东省江门市五邑大学南门");
        }

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    //自定义ViewHolder类
    static class NewsViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView meizhi;
        TextView news_title;
        TextView news_desc;

        public NewsViewHolder(final View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            meizhi = (ImageView) itemView.findViewById(R.id.news_photo);
            news_title = (TextView) itemView.findViewById(R.id.news_title);
            news_desc = (TextView) itemView.findViewById(R.id.news_desc);
            //设置TextView背景为半透明
            news_title.setBackgroundColor(Color.argb(20, 0, 0, 0));
        }


    }
}
