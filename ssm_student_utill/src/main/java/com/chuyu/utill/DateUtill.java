package com.chuyu.utill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtill {
    //将日期转化为String
    public static String dateToString(Date date,String patt){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patt);
        String format = simpleDateFormat.format(date);
        return format;
    }

    //将String转为date
    public static Date stringToDate(Date date,String patt ) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = sdf.parse(patt);
        return parse;

    }
    public void tes(){
        System.out.println("有一个测试的");
    }
}
