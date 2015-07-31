package com.example.nick.hsarenadraft;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Nick on 7/25/2015.
 *
 * This database is meant to hold all the cards in the game. It will be created once, and then never edited, only accessed.
 */
public class CardDatabase {

    // Becomes the filename of the database
    private static final String DATABASE_NAME = "cards.db";
    // Only one table in this database
    private static final String TABLE_NAME = "cards";
    // We increment this every time we change the database schema which will
    // kick off an automatic upgrade
    private static final int DATABASE_VERSION = 1;

    public static final String KEY_ID = "_id";

    public static final String KEY_NAME = "name";
    public static final String KEY_TEXT = "text";
    public static final String KEY_RARITY = "rarity";
    public static final String KEY_TYPE = "type";
    public static final String KEY_COST = "cost";
    public static final String KEY_CLASS = "class";

    public static String DROP_STATEMENT = "DROP TABLE IF EXISTS " + TABLE_NAME;
    public static String CREATE_STATEMENT;
    static {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE " + TABLE_NAME + " (");
        sb.append(KEY_ID + " integer primary key autoincrement, ");
        sb.append(KEY_NAME + " text, ");
        sb.append(KEY_RARITY + " text, ");
        sb.append(KEY_TEXT + " text, ");
        sb.append(KEY_TYPE + " text, ");
        sb.append(KEY_CLASS + " text, ");
        sb.append(KEY_COST + " integer");


        sb.append(")");
        CREATE_STATEMENT = sb.toString();
    }


    private static class CardDBHelper extends SQLiteOpenHelper {

        public CardDBHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            db.execSQL(CREATE_STATEMENT);


        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            db.execSQL(DROP_STATEMENT);
            onCreate(db);

        }
    }

}


