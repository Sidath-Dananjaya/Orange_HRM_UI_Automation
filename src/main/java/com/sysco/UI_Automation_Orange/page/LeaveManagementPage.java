package com.sysco.UI_Automation_Orange.page;

import com.sysco.UI_Automation_Orange.data.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LeaveManagementPage extends PageBase{

    private static By btnLeave = By.xpath(".//b[.='Leave']");
    private static By btnEntitlements = By.xpath(".//a[@id='menu_leave_Entitlements']");
    private static By btnAddEntitlements = By.xpath(".//a[@id='menu_leave_addLeaveEntitlement']");
    private static By txtLeaveEmployee = By.xpath(".//input[@id='entitlements_employee_empName']");
    private static By txtEntitlement = By.xpath(".//input[@id='txtPassword']");
    private static By btnLeaveSave = By.xpath(".//input[@id='btnLogin']");
    private static By lblAddLeaveEntitlements = By.xpath(".//h1[.='Add Leave Entitlement']");
    private static By lblLeaveEntitlements = By.xpath(".//*[@id='leave-entitlementsSearch']/a");
    private static By inkLogout = By.xpath(".//a[.='Logout']");
    private static By btnApplyLeave = By.xpath(".//a[@id='menu_leave_applyLeave']");
    private static By drpApplyLeaveType = By.xpath(".//*[@id='applyleave_txtLeaveType']");
    private static By drpApplyLeaveTypeOption2 = By.xpath(".//*[@id='applyleave_txtLeaveType']/option[2]");
    private static By drpFromDate =  By.xpath(".//input[@id='applyleave_txtFromDate']");
    private static By btnFromDate =  By.xpath(".//a[.='21']");
    private static By drpToDate =  By.xpath(".//input[@id='applyleave_txtToDate']");
    private static By btnToDate =  By.xpath(".//a[.='22']");
    private static By btnApply = By.xpath(".//input[@id='applyBtn']");
    private static By tblLeaveTable = By.xpath(".//div[@class='box single']/div[@class='inner']");
    private static By btnMyLeave = By.xpath(".//a[@id='menu_leave_viewMyLeaveList']");
    private static By tblLeaveDetails = By.xpath(".//div[@id='search-results']/div[@class='inner']");

    private static WebElement txtLeaveEntitledEmployee = syscoLabUI.findElement(By.xpath(".//input[@id='entitlements_employee_empName']"));
    private static WebElement drpLeaveType = syscoLabUI.findElement(By.xpath(".//select[@id='entitlements_leave_type']"));
    private static WebElement lblEntitlementType = syscoLabUI.findElement(By.xpath(".//td[.='Added']"));
    private static WebElement lblValidFrom = syscoLabUI.findElement(By.xpath(".//a[.='2020-01-01']"));
    private static WebElement lblValidTo = syscoLabUI.findElement(By.xpath(".//a[.='2020-12-31']"));
    private static WebElement lblDays = syscoLabUI.findElement(By.xpath(".//a[.='3.00']"));
    private static WebElement lblLeaveBalance = syscoLabUI.findElement(By.xpath(".//div[@id='applyleave_leaveBalance']"));
    private static WebElement lblAppliedDate = syscoLabUI.findElement(By.xpath(".//a[.='2020-05-22']"));
    private static WebElement lblLeaveAppliedEmployee = syscoLabUI.findElement(By.xpath(".//a[.='Jhon Andrew']"));

    public static String leaveEntitledEmployee;
    public static String leaveType;
    public static String entitlementType;
    public static String validFrom;
    public static String validTo;
    public static String days;
    public static String leaveDate;
    public static String leaveDateByAdmin;

    public static boolean isLeavePageVisible() throws IOException {

        syscoLabUI.click(btnLeave);
        syscoLabUI.click(btnEntitlements);
        syscoLabUI.click(btnAddEntitlements);
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return syscoLabUI.isDisplayed(lblAddLeaveEntitlements);

    }

    public static boolean addLeaveEntitlement(){

        syscoLabUI.sendKeys(txtLeaveEmployee, Data.employeeName);
        syscoLabUI.sendKeys(txtEntitlement, Data.leaveEntitlement);
        syscoLabUI.click(btnLeaveSave);
        leaveEntitledEmployee = txtLeaveEntitledEmployee.getText();
        leaveType = drpLeaveType.getText();
        entitlementType = lblEntitlementType.getText();
        validFrom = lblValidFrom.getText();
        validTo =   lblValidTo.getText();
        days = lblDays.getText();

        return syscoLabUI.isDisplayed(lblLeaveEntitlements);
    }

    public static boolean applyLeavesByEmployee(){

        syscoLabUI.click(OrangeLoginPage.lblUserName);
        syscoLabUI.click(inkLogout);
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        syscoLabUI.sendKeys(OrangeLoginPage.txtUserName, Data.newUser);
        syscoLabUI.sendKeys(OrangeLoginPage.txtPassword, Data.newpassword);
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        syscoLabUI.click(btnLeave);
        syscoLabUI.click(btnApplyLeave);
        syscoLabUI.click(drpApplyLeaveType);
        syscoLabUI.click(drpApplyLeaveTypeOption2);
        syscoLabUI.click(drpFromDate);
        syscoLabUI.click(btnFromDate);
        syscoLabUI.click(drpToDate);
        syscoLabUI.click(btnToDate);
        syscoLabUI.click(btnApply);
        syscoLabUI.click(btnMyLeave);
        leaveDate = lblAppliedDate.getText();

        return syscoLabUI.isDisplayed(tblLeaveTable);
    }

    public static boolean isAddedLeaveDisplayed(){

        syscoLabUI.click(OrangeLoginPage.lblUserName);
        syscoLabUI.click(inkLogout);
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        syscoLabUI.sendKeys(OrangeLoginPage.txtUserName, Data.userName);
        syscoLabUI.sendKeys(OrangeLoginPage.txtPassword, Data.password);
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        syscoLabUI.click(btnLeave);
        leaveDateByAdmin = lblAppliedDate.getText();
        leaveEntitledEmployee = lblLeaveAppliedEmployee.getText();

        return syscoLabUI.isDisplayed(tblLeaveDetails);
    }

}

