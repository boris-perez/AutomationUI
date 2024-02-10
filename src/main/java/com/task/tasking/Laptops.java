package com.task.tasking;

import com.actions.Click;
import com.actions.WaitUntilElement;
import com.ui.LaptopsUI;
import org.openqa.selenium.WebDriver;


public class Laptops {

    public static void selectProduct(WebDriver driver) {
        Click.on(driver, LaptopsUI.laptopsButton);
        WaitUntilElement.isVisible(driver, LaptopsUI.macBookAir);
    }


}
