package com.scottfu.wyh.pick_image;

import android.content.Context;

import java.io.Serializable;

/**
 * Created by fujindong on 2017/6/2.
 */

public class GalleryHelper {

    public static class GalleryOption implements Serializable {

        /**
         * 是否允许拍照
         */
        public boolean cameraState = true;

        /**
         * 是否多选
         */
        public boolean multiSelect = true;

        /**
         * 最多选多少张图（多选时有效）
         */
        public int multiSelectMaxCount = 9;

        /**
         * 是否进行图片裁剪(图片选择模式：false / 图片裁剪模式：true)
         */
        public boolean crop = false;

        /**
         * 图片裁剪的宽度（裁剪模式时有效）
         */
        public int cropOutputImageWidth = 720;

        /**
         * 图片裁剪的高度（裁剪模式时有效）
         */
        public int cropOutputImageHeight = 720;

        /**
         * 图片选择保存路径  如果不设置选择图片的保存路径 在选择图片时默认保存到包下的cache／image
         *
         */
        public String outputPath = null;
    }

    public static void pickImage(Context context, int requestCode, GalleryOption option) {


    }

}
