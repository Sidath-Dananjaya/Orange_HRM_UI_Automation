package com.sysco.UI_Automation_Orange.tests;

import com.sysco.UI_Automation_Orange.function.OrangeLogin;
import com.sysco.UI_Automation_Orange.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static com.sysco.UI_Automation_Orange.function.OrangeLogin.login;

public class OrangeLoginTest extends TestBase {
    SoftAssert softAssert = new SoftAssert();
@Test
    public void testOrangeLoginPage() throws IOException {

        OrangeLogin.loadHomePage();
        softAssert.assertEquals(login.isHomePageVisible(),true,"Home Page is displayed");
        softAssert.assertAll();
    }

@Test

    public void testOrangeLogin() throws IOException {

        OrangeLogin.verifyLogin();
        softAssert.assertEquals(login.loginHomePage(),true,"User successfully logged In");
        softAssert.assertAll();
}
}
