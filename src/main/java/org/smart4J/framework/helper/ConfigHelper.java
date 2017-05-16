package org.smart4J.framework.helper;

import org.smart4J.framework.ConfigConstant;
import org.smart4J.framework.util.PropUtils;

import java.util.Properties;

/**
 * 配置文件工具类
 * Created by 9ying on 2017/5/16.
 */
public final class ConfigHelper {
    //加载配置文件
    private static final Properties CONFIG_PROPS = PropUtils.loadProp(ConfigConstant.CONFIG_FILE);

    /**
     * 获取JDBC Driver
     */
    public static String getJdbcDriver(){
        return PropUtils.getString(CONFIG_PROPS,ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 获取JDBC URL
     */
    public static String getJdbcUrl(){
        return PropUtils.getString(CONFIG_PROPS,ConfigConstant.JDBC_URL);
    }

    /**
     * 获取JDBC UserNAme
     */
    public static String getJdbcUserName(){
        return PropUtils.getString(CONFIG_PROPS,ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 获取JDBC PassWord
     */
    public static String getJdbcPassWord(){
        return PropUtils.getString(CONFIG_PROPS,ConfigConstant.JDBC_PASSWORD);
    }

    /**
     * 获取应用基础包名
     */
    public static String getAppBasePath(){
        return PropUtils.getString(CONFIG_PROPS,ConfigConstant.APP_BASE_PACKAGE);
    }

    /**
     * 获取应用试图路径
     */
    public static String getAppViewPath(){
        return PropUtils.getString(CONFIG_PROPS,ConfigConstant.APP_VIEW_PATH,"/WEB-INF/view");
    }

    /**
     * 获取应用静态资源路径
     */
    public static String getAppAssetPath(){
        return PropUtils.getString(CONFIG_PROPS,ConfigConstant.APP_ASSET_PATH,"/asset/");
    }
}
