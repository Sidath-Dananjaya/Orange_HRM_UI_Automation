package com.sysco.UI_Automation_Orange.page;

import com.sysco.UI_Automation_Orange.common.Constants;
import com.sysco.UI_Automation_Orange.data.Data;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OrangeLoginPage extends PageBase{

    public static By divLogo = By.xpath(".//div[@id='divLogo']");
    public static By txtUserName = By.xpath(".//input[@id='txtUsername']");
    public static By txtPassword = By.xpath(".//input[@id='txtPassword']");
    public static By btnLogin = By.xpath(".//input[@id='btnLogin']");
    public static By lblUserName = By.xpath(".//a[@id='welcome']");

    public static boolean isHomePageVisible() throws IOException {
        syscoLabUI = PageBase.getSyscoLabUIOgm(null);
        syscoLabUI.navigateTo(Constants.APP_URL);
        syscoLabUI.getDriver().manage().window().maximize();
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        return syscoLabUI.isDisplayed(divLogo);

    }

    public static boolean loginHomePage(){

        syscoLabUI.sendKeys(txtUserName, Data.userName);
        syscoLabUI.sendKeys(txtPassword, Data.password);
        syscoLabUI.click(btnLogin);
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        return syscoLabUI.isDisplayed(lblUserName);
    }


    public void quit() {
        if (syscoLabUI != null) {
            syscoLabUI.quit();
        }
    }

}
