package com.neo.duan.imageloader;

import android.content.Context;
import android.widget.ImageView;

/**
 * @author neo.duan
 * @date 2019/3/28 4:03 PM
 * @desc 图片加载策略接口
 */
public interface ImageLoaderStrategy {

    void loadImage(String url, ImageView imageView);

    void loadImage(String url, int placeholder, ImageView imageView);

    void loadImage(Context context, String url, int placeholder, ImageView imageView);

    void loadRoundImage(Context context, String url, int radius, ImageView imageView);

    void loadRoundImage(Context context, String url, int radius, int placeholder, ImageView imageView);

    void clearImageDiskCache(Context context);

    void clearIamgeMemoryCache(Context context);

    String getCacheSize(Context context);

}
