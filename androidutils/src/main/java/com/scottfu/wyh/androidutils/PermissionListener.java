package com.scottfu.wyh.androidutils;

import java.util.List;

/**
 * Created by fujindong on 2017/6/2.
 */

public interface PermissionListener {

    void onGranted();

    /**
     * 未授权的权限
     * @param deniedPermissions
     */
    void onDenied(List<String> deniedPermissions);
}
