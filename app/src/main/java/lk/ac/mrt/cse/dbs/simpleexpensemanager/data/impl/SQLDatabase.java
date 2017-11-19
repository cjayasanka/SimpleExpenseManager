package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl;

import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Chathura on 11/18/2017.
 */

public class SQLDatabase extends SQLiteOpenHelper
{

    public static final String DATABASE_NAME = "150251P.db";
    public static final int DATABASE_VERSION = 1;

    public SQLDatabase(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL("CREATE TABLE Accounts (accountNo TEXT PRIMARY KEY, bankName TEXT, accountHolderName TEXT, balance REAL)");
        sqLiteDatabase.execSQL("CREATE TABLE Transactions (date TEXT, accountNo TEXT, expenceType TEXT, amount REAL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion)
    {
        return;
    }

}
