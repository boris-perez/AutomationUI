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
        if (!price.isEmpty()) {
            System.out.println("La prueba fue exitosa");
            System.out.println("El precio del Mac Book Air es: " + price);
        } else {
            System.out.println("La prueba fue fallida");
        }
    }

    @Test
    public void verifyMacBookProPrice() {
        Laptops.selectProduct(webDriver);
        Common.selectItem(webDriver, LaptopsUI.macBookPro);
        String price = Common.verifyPrice(webDriver);
        if (!price.isEmpty()) {
            System.out.println("La prueba fue exitosa");
            System.out.println("El precio del Mac Book Pro es: " + price);
        } else {
            System.out.println("La prueba fue fallida");
        }
    }

    @Test
    public void verifyDellI7Price() {
        Laptops.selectProduct(webDriver);
        Common.selectItem(webDriver, LaptopsUI.macBookAir);
        String price = Common.verifyPrice(webDriver);
        if (!price.isEmpty()) {
            System.out.println("La prueba fue exitosa");
            System.out.println("El precio del Dell I7 es: " + price);
        } else {
            System.out.println("La prueba fue fallida");
        }
    }
}
