package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultTest extends BeforeTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "multDoubleTest", groups = "multDiv")
    public void multDoubleTest(double a, double b, double result) {
        Assert.assertEquals(calculator.mult(a, b), result);
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "multLongTest", groups = "multDiv")
    public void multLongTest(long a, long b, long result) {
        Assert.assertEquals(calculator.mult(a, b), result);
    }
}
