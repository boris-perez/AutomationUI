package com.task.tasking;

import com.actions.Click;
import com.actions.GetText;
import com.ui.CommonUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Common {

    public static void selectItem(WebDriver driver, By item) {
        Click.on(driver, item);
    }

    public static void homePage(WebDriver driver) {
        Click.on(driver, CommonUI.homeButton);
    }

    public static String verifyPrice(WebDriver driver) {
        return GetText.on(driver, CommonUI.price);
    }

}
