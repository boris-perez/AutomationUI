import base.BaseTest;
import com.task.tasking.Common;
import com.task.tasking.Laptops;
import com.task.tasking.Monitors;
import com.task.tasking.Phones;
import com.ui.LaptopsUI;
import com.ui.MonitorsUI;
import com.ui.PhonesUI;
import org.testng.annotations.Test;

public class NavigateProductTest extends BaseTest {

    String price;

    @Test
    public void NavigateItems() {
        Laptops.selectProduct(webDriver);
        Common.selectItem(webDriver, LaptopsUI.macBookAir);
        price = Common.verifyPrice(webDriver);
        System.out.println("El precio del Mac Book Air es: " + price);
        Common.homePage(webDriver);
        Laptops.selectProduct(webDriver);
        Common.selectItem(webDriver, LaptopsUI.macBookPro);
        price = Common.verifyPrice(webDriver);
        System.out.println("El precio del Mac Book Pro es: " + price);
        Common.homePage(webDriver);
        Laptops.selectProduct(webDriver);
        Common.selectItem(webDriver, LaptopsUI.macBookAir);
        price = Common.verifyPrice(webDriver);
        System.out.println("El precio del Dell I7 es: " + price);
        Common.homePage(webDriver);
        Monitors.selectProduct(webDriver);
        Common.selectItem(webDriver, MonitorsUI.asusFullDH);
        price = Common.verifyPrice(webDriver);
        System.out.println("El precio del Assus Full HD es: " + price);
        Common.homePage(webDriver);
        Phones.selectProduct(webDriver);
        Common.selectItem(webDriver, PhonesUI.htcOneM9);
        price = Common.verifyPrice(webDriver);
        System.out.println("El precio del HTC ONE M9 es: " + price);
        Common.homePage(webDriver);
    }
}
