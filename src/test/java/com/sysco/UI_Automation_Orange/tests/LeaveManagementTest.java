package com.sysco.UI_Automation_Orange.tests;

import com.sysco.UI_Automation_Orange.function.LeaveManagement;
import com.sysco.UI_Automation_Orange.function.NewEmployee;
import com.sysco.UI_Automation_Orange.function.OrangeLogin;
import com.sysco.UI_Automation_Orange.utils.TestBase;
import org.apache.log4j.Priority;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static com.sysco.UI_Automation_Orange.function.LeaveManagement.leave;
import static com.sysco.UI_Automation_Orange.function.NewEmployee.employee;

public class LeaveManagementTest extends TestBase {

    SoftAssert softAssert = new SoftAssert();
@Test
    public void testLeaveManagement() throws IOException {

        LeaveManagement.verifyLeaveManagement();
        softAssert.assertEquals(leave.isLeavePageVisible(),true,"Leave Page is visible");
        softAssert.assertEquals(leave.addLeaveEntitlement(),true,"Leave Entitlement is successful");
        softAssert.assertEquals(leave.leaveEntitledEmployee,"Jhon Andrew","Employee Name from user view is validated");
        softAssert.assertEquals(leave.leaveType,"FLMA US","Leave Type is validated");
        softAssert.assertEquals(leave.validFrom,"2020-01-01","Valid from is validated");
        softAssert.assertEquals(leave.validTo,"2020-12-31","Valid to is validated");
        softAssert.assertEquals(leave.days,"10","Days is validated");
        softAssert.assertEquals(leave.leaveDate,"2020-05-22","Leave Date from user view is validated");
        softAssert.assertEquals(leave.isAddedLeaveDisplayed(),true,"Added Leave is displayed via admin");
        softAssert.assertEquals(leave.leaveDate,"2020-05-22","Leave Date from admin view is validated");
        softAssert.assertEquals(leave.leaveEntitledEmployee,"Jhon Andrew","Employee Name from admin view is validated");
        softAssert.assertAll();


    }


}
