package com.yt.activities;

import android.app.Activity;
import android.util.Log;

import yt.sdk.access.InitializationException;
import yt.sdk.access.YTSDK;

public class YTSDKUtils {
	private static YTSDK ytsdk = null;

	public static void initilizeYTSDK(Activity activity) {
		try {
			if (ytsdk == null) {
				ytsdk = YTSDK.getInstance(activity);
			}
			ytsdk.setDownloadFolderPath("download");
		} catch (InitializationException e) {
			Log.d("YTSDK", "exception " + e.toString());
		} catch (Exception e) {
			Log.d("YTSDK", "exception " + e.toString());
		}
	}

	public static YTSDK getYTSDK() {		
		return ytsdk;
	}
}