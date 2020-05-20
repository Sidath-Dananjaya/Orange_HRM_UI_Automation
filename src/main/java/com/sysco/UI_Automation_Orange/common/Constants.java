package com.sysco.UI_Automation_Orange.common;

public class Constants {
    public static final boolean RUN_LOCALLY = Boolean.parseBoolean(System.getProperty("run.locally", "true"));
    public static final String APP_URL = System.getProperty("app.url", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");


}
