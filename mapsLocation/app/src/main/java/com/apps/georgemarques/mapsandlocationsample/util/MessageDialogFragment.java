package com.apps.georgemarques.mapsandlocationsample.util;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by george on 03/08/15.
 */
public class MessageDialogFragment extends DialogFragment {
    private Dialog mDialog;

    public MessageDialogFragment(){
        super();
        mDialog = null;
        setRetainInstance(true);
    }

    public void setDialog(Dialog dialog){
        mDialog = dialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        return mDialog;
    }
}
