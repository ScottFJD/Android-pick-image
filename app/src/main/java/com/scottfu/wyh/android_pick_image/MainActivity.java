package com.scottfu.wyh.android_pick_image;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.scottfu.wyh.pick_image.PickImageActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick);
        Intent intent = new Intent(this, PickImageActivity.class);
        startActivity(intent);
    }
}
