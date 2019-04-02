package com.neo.duan.imageloader;

import android.content.Context;
import android.widget.ImageView;

import com.neo.duan.imageloader.strategy.GlideImageLoaderStrategy;

/**
 * @author neo.duan
 * @date 2019/3/28 3:59 PM
 * @desc 图片显示工具类
 */
public class ImageLoaderUtils implements ImageLoaderStrategy {

    private static ImageLoaderUtils mInstance;

    private ImageLoaderStrategy mStrategy;

    private ImageLoaderUtils() {
        //默认使用Glide加载图片
        mStrategy = new GlideImageLoaderStrategy();
    }

    public ImageLoaderUtils getInstance() {
        if (mInstance == null) {
            synchronized (ImageLoaderUtils.class) {
                if (mInstance == null) {
                    mInstance = new ImageLoaderUtils();
                    return mInstance;
                }
            }
        }
        return mInstance;
    }

    public void setImageLoaderStrategy(ImageLoaderStrategy strategy) {
        this.mStrategy = strategy;
    }


    @Override
    public void loadImage(String url, ImageView imageView) {
        mStrategy.loadImage(url, imageView);
    }

    @Override
    public void loadImage(String url, int placeholder, ImageView imageView) {
        mStrategy.loadImage(url, placeholder, imageView);
    }

    @Override
    public void loadImage(Context context, String url, int placeholder, ImageView imageView) {
        mStrategy.loadImage(context, url, placeholder, imageView);
    }

    @Override
    public void loadRoundImage(Context context, String url, int radius, ImageView imageView) {
        mStrategy.loadRoundImage(context, url, radius, imageView);
    }

    @Override
    public void loadRoundImage(Context context, String url, int radius, int placeholder, ImageView imageView) {
        mStrategy.loadRoundImage(context, url, radius, placeholder, imageView);
    }

    @Override
    public void clearImageDiskCache(Context context) {
        mStrategy.clearImageDiskCache(context);
    }

    @Override
    public void clearImageMemoryCache(Context context) {
        mStrategy.clearImageMemoryCache(context);
    }

    @Override
    public String getCacheSize(Context context) {
        return mStrategy.getCacheSize(context);
    }
}
