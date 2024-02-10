import base.BaseTest;
import com.task.tasking.Common;
import com.task.tasking.Laptops;
import com.ui.LaptopsUI;
import org.testng.annotations.Test;

public class LaptopsTest extends BaseTest {

    @Test
    public void verifyMacBookAirPrice() {
        Laptops.selectProduct(webDriver);
        Common.selectItem(webDriver, LaptopsUI.macBookAir);
        String price = Common.verifyPrice(webDriver);
        System.out.println("El precio del Mac Book Air es: " + price);
    }

    @Test
    public void verifyMacBookProPrice() {
        Laptops.selectProduct(webDriver);
        Common.selectItem(webDriver, LaptopsUI.macBookPro);
        String price = Common.verifyPrice(webDriver);
        System.out.println("El precio del Mac Book Pro es: " + price);
    }

    @Test
    public void verifyDellI7Price() {
        Laptops.selectProduct(webDriver);
        Common.selectItem(webDriver, LaptopsUI.macBookAir);
        String price = Common.verifyPrice(webDriver);
        System.out.println("El precio del Dell I7 es: " + price);
    }
}
