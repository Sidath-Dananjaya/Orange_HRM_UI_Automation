package com.sysco.UI_Automation_Orange.tests;

import com.sysco.UI_Automation_Orange.function.NewEmployee;
import com.sysco.UI_Automation_Orange.function.OrangeLogin;
import com.sysco.UI_Automation_Orange.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.IOException;
import static com.sysco.UI_Automation_Orange.function.NewEmployee.employee;
import static com.sysco.UI_Automation_Orange.function.OrangeLogin.login;

public class NewEmployeeTest extends TestBase {
    SoftAssert softAssert = new SoftAssert();

@Test
    public void testNewEmployee() throws IOException {

        NewEmployee.verifyNewEmployee();
        softAssert.assertEquals(employee.addEmployee(),true,"Employee added successfully");

        OrangeLogin.verifyLogin();
        softAssert.assertEquals(employee.verifyEmployee(),true,"Employee is in the details section");
        softAssert.assertAll();
    }
@Test
    public void testAddUser(){

        NewEmployee.verifyUserCreation();
        softAssert.assertEquals(employee.addUser(),true,"User has created");
        softAssert.assertAll();


}
}
