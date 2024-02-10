package com.task.tasking;

import com.actions.Click;
import com.actions.WaitUntilElement;
import com.ui.MonitorsUI;
import org.openqa.selenium.WebDriver;

public class Monitors {

    public static void selectProduct(WebDriver driver) {
        Click.on(driver, MonitorsUI.monitorsButton);
        WaitUntilElement.isVisible(driver, MonitorsUI.asusFullDH);
    }

}
