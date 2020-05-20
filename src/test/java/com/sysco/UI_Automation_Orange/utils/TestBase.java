package com.sysco.UI_Automation_Orange.utils;

import com.sysco.UI_Automation_Orange.function.OrangeLogin;
import com.syscolab.qe.core.reporting.SyscoLabListener;
import com.syscolab.qe.core.reporting.SyscoLabQCenter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class TestBase {

    private SyscoLabListener testListeners;
    private SyscoLabQCenter syscoLabQCenter;

@BeforeClass
    public void initiate() throws IOException {
        testListeners = new SyscoLabListener();
        syscoLabQCenter = new SyscoLabQCenter();

    try {
        Runtime.getRuntime().exec("killall chrome || true");
        Runtime.getRuntime().exec("pkill chromium-browse || true");
        Runtime.getRuntime().exec("killall chromium-browse || true");
    } catch (IOException e) {

    }
        OrangeLogin.loadHomePage();

    }


@AfterClass(alwaysRun = true)

    public void cleanUp(){

    OrangeLogin.quitDriver();

    }
}
