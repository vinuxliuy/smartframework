package org.smart4J.framework.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by 9ying on 2017/5/16.
 */
public class PropUtils {
    private static final  Logger LOGGER  = LoggerFactory.getLogger(PropUtils.class);

    /**
     *  加载配置文件
     */
    public static Properties loadProp(String fileName){
        Properties properties = null;
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if(inputStream == null){
                throw new FileNotFoundException(fileName+" file not found!");
            }
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
           LOGGER.error("load properties file failure",e);
        }finally {
            if(properties != null ){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    LOGGER.error("Close input file failure");
                }
            }
        }
        return properties;
    }

    /**
     *  获取字符串属性，默认为空串
     */
    public static String getString(Properties props, String key){
        return getString(props,key,"");
    }

    /**
     *  获取字符串属性，可指定默认值
     */
    public static String getString(Properties props, String key,String defaultValue){
        String value = defaultValue;

        if(props.containsKey(key)){
            value = props.getProperty(key);
        }
        return value;
    }

    /**
     *  获取整型属性，默认为0
     */
    public static int getInt(Properties props, String key){
        return getInt(props, key,0);
    }

    /**
     *  获取整型属性，可指定默认值
     */
    public static int getInt(Properties props, String key,int defaultValue){
        int value = defaultValue;
        if(props.containsKey(key)){
            value = CastUtil.castInt(props.getProperty(key));
        }
        return value;
    }

}
