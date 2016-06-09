package com.globant.comparative.utils;

import android.content.res.AssetFileDescriptor;
import android.util.Log;

import com.globant.comparative.model.RecordModel;

import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.UniqueHashCode;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;

import java.io.FileInputStream;
import java.io.FileReader;

/**
 * Created by zadtankus on 8/06/16.
 */
public class CsvReaderUtils {
    private final static String TAG = CsvReaderUtils.class.getSimpleName();

    public static CellProcessor[] getProcessors(){
        final CellProcessor[] processors = new CellProcessor[]{
                new UniqueHashCode(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
                new NotNull(),
        };
        return processors;
    }

    public static void readWithCsvBeanReader() throws Exception{
        ICsvBeanReader beanReader = null;

        try{
            beanReader = new CsvBeanReader(new FileReader(Constants.FILE_NAME),
                    Constants.PIPE_DELIMITED);

            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = getProcessors();

            RecordModel model;
            while((model=beanReader.read(RecordModel.class, header, processors)) != null){
                Log.d(TAG,"ROW NUMBER ["+beanReader.getRowNumber()+"] val name ["+model.getName()+"]");
            }
        }finally{
            if(beanReader != null){
                beanReader.close();
            }
        }
    }
}
