package com.sysco.UI_Automation_Orange.page;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.Capabilities;

public class PageBase {
    public static SyscoLabUI syscoLabUI;

    public static SyscoLabUI getSyscoLabUIOgm(Capabilities capabilities) {
        syscoLabUI = new SyscoLabWUI(capabilities);

        return syscoLabUI;
    }
}
