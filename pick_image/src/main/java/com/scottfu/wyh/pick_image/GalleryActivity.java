package com.scottfu.wyh.pick_image;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import com.scottfu.wyh.androidutils.BaseActivity;
import com.scottfu.wyh.androidutils.PermissionListener;
import com.scottfu.wyh.androidutils.utils.ToastManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fujindong on 2017/6/2.
 */

public class GalleryActivity extends BaseActivity {

    private static final String GALLERY_OPTION = "galleryOption";




    public static void start(Activity activity, int requestCode, GalleryHelper.GalleryOption option) {

        Intent intent = new Intent();
        intent.setClass(activity, GalleryActivity.class);
        Bundle extras = new Bundle();
        extras.putSerializable(GALLERY_OPTION, option);
        intent.putExtras(extras);
        activity.startActivityForResult(intent, requestCode);
    }



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getPermission();

    }

    private void getPermission() {
        requestRuntimePermission(new String[]{Manifest.permission.CAMERA}, new PermissionListener() {
            @Override
            public void onGranted() {
                ToastManager.showToast(GalleryActivity.this, getResources().getString(R.string.granted));
            }

            @Override
            public void onDenied(List<String> deniedPermissions) {
                ToastManager.showToast(GalleryActivity.this, getResources().getString(R.string.denied));
            }
        });
    }


}
