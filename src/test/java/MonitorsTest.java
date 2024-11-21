import base.BaseTest;
import com.task.tasking.Common;
import com.task.tasking.Monitors;
import com.ui.MonitorsUI;
import org.testng.annotations.Test;

public class MonitorsTest extends BaseTest {

    @Test
    public void verifyMonitorPrice() {
        Monitors.selectProduct(webDriver);
        Common.selectItem(webDriver, MonitorsUI.asusFullDH);
        String price = Common.verifyPrice(webDriver);
        if (!price.isEmpty()) {
            System.out.println("La prueba fue exitosa");
            System.out.println("El precio del Assus Full HD es: " + price);
        } else {
            System.out.println("La prueba fue fallida");
        }
    }


}
