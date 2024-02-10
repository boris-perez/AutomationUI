import base.BaseTest;
import com.task.tasking.Common;
import com.task.tasking.Phones;
import com.ui.PhonesUI;
import org.testng.annotations.Test;

public class PhonesTest extends BaseTest {

    @Test
    public void verifyPhonesPrice() {
        Phones.selectProduct(webDriver);
        Common.selectItem(webDriver, PhonesUI.htcOneM9);
        String price = Common.verifyPrice(webDriver);
        if (!price.isEmpty()) {
            System.out.println("La prueba fue exitosa");
            System.out.println("El precio del HTC ONE M9 es: " + price);
        } else {
            System.out.println("La prueba fue fallida");
        }
    }

}
