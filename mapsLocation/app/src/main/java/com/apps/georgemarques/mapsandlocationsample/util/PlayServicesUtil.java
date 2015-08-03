package com.apps.georgemarques.mapsandlocationsample.util;

import android.app.Dialog;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

/**
 * Created by george on 03/08/15.
 */
public class PlayServicesUtil {
    public final static int REQUEST_CODE_ERROR_PLAY_SERVICES = 9000;

    public static boolean isPlayServiceAvailable(FragmentActivity activity){
        int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity);
        if(resultCode == ConnectionResult.SUCCESS){
            return true;
        } else{
            showErrorMessage(activity,resultCode);
            return false;
        }
    }

    public static void showErrorMessage(FragmentActivity activity, int errorCode){
        Dialog errorDialog = GooglePlayServicesUtil.getErrorDialog(errorCode, activity,REQUEST_CODE_ERROR_PLAY_SERVICES);

        if(errorDialog != null){
            MessageDialogFragment errorFragment = new MessageDialogFragment();
            errorFragment.setDialog(errorDialog);
            errorFragment.show( activity.getFragmentManager() , "DIALOG_ERROR_PLAY_SERVICES");
        }
    }
}
