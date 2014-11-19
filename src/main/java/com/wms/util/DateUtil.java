/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wms.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat.FULL = 0 
 * DateFormat.DEFAULT = 2 
 * DateFormat.LONG = 1
 * DateFormat.MEDIUM = 2 
 * DateFormat.SHORT = 3
 * 
 * getDateInstance获取日期实例将丢失时分秒参数
 * 
 * @author cgx1844568
 * @date 2014-11-19
 * @time 11:04:41
 *
 */
public  class DateUtil {

    /**
     * 将Date格式化为String
     * @param date
     * @param str
     * @return 
     */
    public static String format(Date date,String str){
        return new SimpleDateFormat(str).format(date);
    }
    
    /**
     * 格式化日期,如:14-9-12
     * @param date
     * @return 
     */
    public static String shortFormat(Date date){
        return DateFormat.getDateInstance(DateFormat.SHORT).format(date);
    }
    
    /**
     * 格式日期并中文化,如:2006年4月16日 星期六
     * @param date
     * @return 
     */
    public static String chineseFormat(Date date){
        return DateFormat.getDateInstance(DateFormat.FULL).format(date);
    }
    
    /**
     * 格式化后只输出日期,如:2006-4-16
     * @param date
     * @return 
     */
    public static String onlyDateFormat(Date date){
        return DateFormat.getDateInstance(DateFormat.DEFAULT).format(date);
    }
}
