package com.sysco.UI_Automation_Orange.function;

import com.sysco.UI_Automation_Orange.page.NewEmployeePage;
import com.sysco.UI_Automation_Orange.page.OrangeLoginPage;
import com.sysco.UI_Automation_Orange.page.PageBase;

import java.io.IOException;

public class NewEmployee extends PageBase {

    public static NewEmployeePage employee = new NewEmployeePage();

    public static void verifyNewEmployee() throws IOException {

        employee.addEmployee();
        employee.verifyEmployee();

    }

    public static void verifyUserCreation(){

        employee.addUser();

    }
}
