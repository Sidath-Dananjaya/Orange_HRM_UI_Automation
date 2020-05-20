package com.sysco.UI_Automation_Orange.page;

import com.sysco.UI_Automation_Orange.data.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class NewEmployeePage extends PageBase{

    private static By btnPIM = By.xpath(".//b[.='PIM']");
    private static By btnAddEmployee = By.xpath(".//a[@id='menu_pim_addEmployee']");
    private static By txtFirstName = By.xpath(".//input[@id='firstName']");
    private static By txtLastName = By.xpath(".//input[@id='lastName']");
    private static By btnSave = By.xpath(".//input[@id='btnSave']");
    private static By lblPersonalDetails = By.xpath(".//div[@id='pdMainContainer']//font[1]/font[.='Personal details']");
    private static By btnEmployeeList = By.xpath(".//a[@id='menu_pim_viewEmployeeList']");
    private static By tblEmployeeDetails = By.xpath(".//*[@id='resultTable']");
    private static By btnAdmin = By.xpath(".//b[.='Admin']");
    private static By btnUserManagement = By.xpath(".//a[@id='menu_admin_UserManagement']");
    private static By btnUsers = By.xpath(".//a[@id='menu_admin_viewSystemUsers']");
    private static By btnAdd = By.xpath(".//input[@id='btnAdd']");
    private static By txtEmployeeName = By.xpath(".//input[@id='systemUser_employeeName_empName']");
    private static By txtUserName = By.xpath(".//input[@id='systemUser_employeeName_empName']");
    private static By txtPassword = By.xpath(".//input[@id='systemUser_password']");
    private static By txtConfirmPassword = By.xpath(".//input[@id='systemUser_confirmPassword']");
    private static By newUser = By.xpath(".//a[.='JhonAdmin']");

    private static WebElement tblfirstName = syscoLabUI.findElement(By.xpath(".//a[.='Jhon']"));
    private static WebElement tbllastName = syscoLabUI.findElement(By.xpath(".//a[.='Andrew']"));

    public static String fName;
    public static String lName;

    public static boolean addEmployee(){

        syscoLabUI.click(btnPIM);
        syscoLabUI.click(btnAddEmployee);
        syscoLabUI.sendKeys(txtFirstName, Data.firstName);
        syscoLabUI.sendKeys(txtLastName, Data.lastName);
        syscoLabUI.click(btnSave);
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        return syscoLabUI.isDisplayed(lblPersonalDetails) ;
    }

    public static boolean verifyEmployee(){

        syscoLabUI.click(btnPIM);
        syscoLabUI.click(btnEmployeeList);
        fName = tblfirstName.getText();
        lName = tbllastName.getText();

        return syscoLabUI.isDisplayed(tblEmployeeDetails);
    }

    public static boolean addUser(){

        syscoLabUI.click(btnAdmin);
        syscoLabUI.click(btnUserManagement);
        syscoLabUI.click(btnUsers);
        syscoLabUI.click(btnAdd);
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        syscoLabUI.sendKeys(txtEmployeeName, Data.employeeName);
        syscoLabUI.sendKeys(txtUserName, Data.newUser);
        syscoLabUI.sendKeys(txtPassword, Data.newpassword);
        syscoLabUI.sendKeys(txtConfirmPassword, Data.newpassword);
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        return syscoLabUI.isDisplayed(newUser);
    }

}
