package com.globant.comparative.asynctasks;

import android.content.res.AssetFileDescriptor;
import android.os.AsyncTask;
import android.util.Log;

import com.globant.comparative.interfaces.FileReaderInt;
import com.globant.comparative.utils.CsvReaderUtils;

/**
 * Created by zadtankus on 8/06/16.
 */
public class RealmTask extends AsyncTask<Void, Void, Boolean>{
    private final static String TAG = RealmTask.class.getSimpleName();

    private FileReaderInt processInt;
    private AssetFileDescriptor desc;

    public RealmTask(FileReaderInt processInt) {
        this.processInt = processInt;

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        try{
            CsvReaderUtils.readWithCsvBeanReader();
            return true;
        }catch(Exception e){
            Log.e(TAG,"THIS IS THE EXCEPTION ["+e+"]");
            return false;
        }
    }

    @Override
    protected void onPostExecute(Boolean aVoid) {
        super.onPostExecute(aVoid);
        if(aVoid){
            processInt.onSuccessRead();
        }else{
            processInt.onFailureRead();
        }
    }
}
