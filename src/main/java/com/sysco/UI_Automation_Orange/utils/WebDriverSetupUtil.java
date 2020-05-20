package com.sysco.UI_Automation_Orange.utils;

import com.sysco.UI_Automation_Orange.common.Constants;

public class WebDriverSetupUtil {

    public static void setToRunLocally() {
        System.out.println("os.name - " + System.getProperty("os.name"));
        System.out.println("os.arch - " + System.getProperty("os.arch"));

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_driver/local/" + System.getProperty("os.arch") + "/chromedriver");

    }
}
