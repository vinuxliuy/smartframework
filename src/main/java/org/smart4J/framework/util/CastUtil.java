package org.smart4J.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by 9ying on 2017/5/16.
 */
public class CastUtil {
    /**
     * 转为String类型（默认为空）
     */
    public static String castString(Object obj){
        return CastUtil.castString(obj,"");
    }

    /**
     * 转型为String类型（可指定默认值）
     */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     *  转型为Double (默认值为0)
     */
    public static double castDouble(Object obj){
        return CastUtil.castDouble(obj,0) ;
    }

    /**
     *  转型为Double (可指定默认值)
     */
    public static double castDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;
        if(obj != null){
            String strValue  = castString(obj);
            if(StringUtils.isNotEmpty(strValue)){
                doubleValue = Double.parseDouble(strValue);
            }
        }
        return doubleValue;
    }

    /**
     * 转型成Long类型(默认值为0)
     */
    public static long castLong(Object obj){
        return CastUtil.castLong(obj,0);
    }

    /**
     * 转型成Long类型(可指定默认值)
     */
    public static long castLong(Object obj, long defaultVaue) {
        long longValue = defaultVaue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)){
                longValue = Long.parseLong(strValue);
            }
        }
        return longValue;
    }
    /**
     * 转型成Int类型(默认值为0)
     */
    public static int castInt(Object obj){
        return CastUtil.castInt(obj,0);
    }

    /**
     * 转型成Int类型(可指定默认值)
     */
    public static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if (obj != null){
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)){
                intValue = Integer.parseInt(strValue);
            }
        }
        return intValue;
    }

    /**
     * 转型成Boolean类型(默认值为false)
     */
    public static boolean castBoolean(Object obj){
        return CastUtil.castBoolean(obj,false);
    }

    /**
     * 转型成Boolean类型(可指定默认值)
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null){
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)){
                booleanValue = Boolean.parseBoolean(strValue);
            }
        }
        return booleanValue;
    }
}
