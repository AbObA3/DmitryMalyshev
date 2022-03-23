package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivTest extends BeforeTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "divDoubleTest", groups = "multDiv")
    public void divDoubleTest(double a, double b, double result) {
        Assert.assertEquals(calculator.div(a, b), result);
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "divLongTest", groups = "multDiv")
    public void divLongTest(long a, long b, long result) {
        Assert.assertEquals(calculator.div(a, b), result);
    }
}
