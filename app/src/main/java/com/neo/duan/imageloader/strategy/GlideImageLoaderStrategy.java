package com.neo.duan.imageloader.strategy;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.module.AppGlideModule;
import com.neo.duan.imageloader.ImageLoaderStrategy;

/**
 * @author neo.duan
 * @date 2019/3/28 4:39 PM
 * @desc 请输入文件描述
 */
public class GlideImageLoaderStrategy implements ImageLoaderStrategy {

    @Override
    public void loadImage(String url, ImageView imageView) {
        loadImage(url, -1, imageView);
    }

    @Override
    public void loadImage(String url, int placeholder, ImageView imageView) {
        loadImage(imageView.getContext(), url, placeholder, imageView);
    }

    @Override
    public void loadImage(Context context, String url, int placeholder, ImageView imageView) {
//        GlideApp.
//        Glide.with(context)
//                .load(url)
//                .placeholder(placeholder)
//                .fitCenter()
//                .into(imageView);
    }

    @Override
    public void loadRoundImage(Context context, String url, int radius, ImageView imageView) {

    }

    @Override
    public void loadRoundImage(Context context, String url, int radius, int placeholder, ImageView imageView) {

    }

    @Override
    public void clearImageDiskCache(Context context) {

    }

    @Override
    public void clearImageMemoryCache(Context context) {

    }

    @Override
    public String getCacheSize(Context context) {
        return null;
    }
}
