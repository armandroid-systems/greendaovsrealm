package com.globant.comparative.presenter;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.util.Log;

import com.globant.comparative.R;
import com.globant.comparative.asynctasks.RealmTask;
import com.globant.comparative.interfaces.FileReaderInt;

/**
 * Created by zadtankus on 8/06/16.
 */
public class PresenterList implements FileReaderInt{
    private final static String TAG = PresenterList.class.getSimpleName();

    private AssetFileDescriptor descriptor;

    public PresenterList(AssetFileDescriptor mContext) {
        this.descriptor = mContext;
    }

    public void executeRead(){
        try{
            new RealmTask(this, descriptor).execute();
        }catch(Exception e){
            Log.e(TAG,"DESCRIPTOR EXCEPTION ["+e+"]");
        }
    }

    @Override
    public void onSuccessRead() {
        Log.d(TAG,"ON SUCCESS...");
    }

    @Override
    public void onFailureRead() {
        Log.d(TAG,"ON FAILURE...");
    }
}
