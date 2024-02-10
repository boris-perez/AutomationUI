package com.task.tasking;

import com.actions.Click;
import com.actions.WaitUntilElement;
import com.ui.PhonesUI;
import org.openqa.selenium.WebDriver;

public class Phones {

    public static void selectProduct(WebDriver driver) {
        Click.on(driver, PhonesUI.phonesButton);
        WaitUntilElement.isVisible(driver, PhonesUI.htcOneM9);
    }

}
