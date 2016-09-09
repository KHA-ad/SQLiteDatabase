package cn.edu.bistu.cs.se.sqlitedatabase;


import android.provider.BaseColumns;

public class Words {
    public Words(){

    }
    public static abstract class Word implements BaseColumns{
        public static final String TABLE_NAME="words";//定义表名
        public static final String COLUMN_NAME_WORD="word";//定义列名
        public static final String COLUMN_NAME_MEANING="meaning";
        public static final String COLUMN_NAME_SAMPLE ="sample";
    }

}
