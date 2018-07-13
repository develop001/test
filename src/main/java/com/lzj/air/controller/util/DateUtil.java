package com.lzj.air.controller.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by air on 2018/3/11.
 * 日期工具类
 *
 * @author air
 */
public class DateUtil {

    public static Date getDateBefore(Date d, int day) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
        return now.getTime();
    }


    /**
     * 根据天数获取日期
     *
     * @param num
     * @return
     */
    public static String getDateStrByNum(String num) {
        Date now = new Date();
        //可以方便地修改日期格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date dateTime = getDateBefore(now, Integer.parseInt(num));
        String dateTimeStr = dateFormat.format(dateTime);

        return dateTimeStr;
    }

    /**
     * date1<date2:-1
     * date1=date2:0
     * date1>date2:1
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int compareDate(String date1, String date2) {
        int result = date1.compareTo(date2);

        return result;
    }


    /**
     * 判断是否是日期格式yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static boolean isDate(String date) {
        boolean convertSucc = true;
        int formatlength = 10;
        //防止年月日正确，时分秒不对却通过了验证的情况
        if (date.length() != formatlength) {
            return false;
        }

        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            format.parse(date);
        } catch (Exception e) {
            convertSucc = false;
        }
        return convertSucc;
    }

    public static void main(String[] args) {
        System.out.println(getDateStrByNum("30"));
    }

}
