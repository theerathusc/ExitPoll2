package com.example.admin.exitpoll.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Poll";
    private static final int DATABASE_VERSION = 1;

 
    public static final String TABLE_NAME = "ExitPoll";
    public static final int NUMBER = 0;
    public static  final  String IMAGE = "image";

    private static final String SQL_CREATE_TABLE_PHONE
            = "CREATE TABLE" + TABLE_NAME + String.valueOf(NUMBER) + IMAGE;
    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE_PHONE);

        ContentValues num = new ContentValues();
        num.put(String.valueOf(NUMBER),0);
        num.put(IMAGE,"vote_no.png");
        db.insert(TABLE_NAME,null,num);
        num = new ContentValues();
        num.put(String.valueOf(NUMBER),0);
        num.put(IMAGE,"one.png");
        db.insert(TABLE_NAME,null,num);
        num = new ContentValues();
        num.put(String.valueOf(NUMBER),0);
        num.put(IMAGE,"two.png");
        db.insert(TABLE_NAME,null,num);
        num = new ContentValues();
        num.put(String.valueOf(NUMBER),0);
        num.put(IMAGE,"three.png");
        db.insert(TABLE_NAME,null,num);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
