package com.scottfu.wyh.android_pick_image;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.scottfu.wyh.pick_image.GalleryHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick);
        GalleryHelper.GalleryOption option = new GalleryHelper.GalleryOption();
        option.cameraState = false;
        option.multiSelectMaxCount = 5;
    }
}
