package com.project.keuanganku.DataBase;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


//used for accessing sqlite database in assets folder
public class DataBaseOpenHelper extends SQLiteAssetHelper {

    public static final String DATABASE_NAME = "keuanganku.db"; //database name
    public static final int DATABASE_VERSION = 3;

    public DataBaseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
