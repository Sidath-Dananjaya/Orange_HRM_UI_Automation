package com.sysco.UI_Automation_Orange.function;

import com.sysco.UI_Automation_Orange.page.OrangeLoginPage;
import com.sysco.UI_Automation_Orange.page.PageBase;
import com.sysco.UI_Automation_Orange.utils.WebDriverSetupUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class OrangeLogin extends PageBase {

    public static OrangeLoginPage login = new OrangeLoginPage();

    public static void loadHomePage() throws IOException {

        WebDriverSetupUtil.setToRunLocally();
        DesiredCapabilities capabilities = null;
        login.isHomePageVisible();
    }

    public static void verifyLogin() throws IOException {

      login.loginHomePage();

    }

    public static void quitDriver(){

        login.quit();

    }
}
