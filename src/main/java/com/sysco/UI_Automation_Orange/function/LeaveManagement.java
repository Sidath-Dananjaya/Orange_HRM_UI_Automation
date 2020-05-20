package com.sysco.UI_Automation_Orange.function;

import com.sysco.UI_Automation_Orange.page.LeaveManagementPage;
import com.sysco.UI_Automation_Orange.page.NewEmployeePage;
import com.sysco.UI_Automation_Orange.page.PageBase;

import java.io.IOException;

public class LeaveManagement extends PageBase {

    public static LeaveManagementPage leave = new LeaveManagementPage();

    public static void verifyLeaveManagement() throws IOException {

        leave.isLeavePageVisible();
        leave.addLeaveEntitlement();
        leave.applyLeavesByEmployee();
        leave.isAddedLeaveDisplayed();
    }
}
