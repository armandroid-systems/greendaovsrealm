package com.globant.comparative.utils;

import org.supercsv.prefs.CsvPreference;

/**
 * Created by zadtankus on 8/06/16.
 */
public class Constants {

    public static final CsvPreference PIPE_DELIMITED = new CsvPreference.Builder('"', '|', "\n").build();
    public static final String FILE_NAME = "src/test/resources/141110.csv";

    public static final String MENU_VIEW = "MENU_VIEW";
    public static final String LIST_VIEW = "LIST_VIEW";
}
