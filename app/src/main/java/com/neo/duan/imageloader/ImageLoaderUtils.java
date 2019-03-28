package com.neo.duan.imageloader;

/**
 * @author neo.duan
 * @date 2019/3/28 3:59 PM
 * @desc 图片显示工具类
 */
public class ImageLoaderUtils {

    private static ImageLoaderUtils mInstance;

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


}
