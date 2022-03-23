package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTest extends BeforeTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "subDoubleTest", groups = "sumSub")
    public void subDoubleTest(double a, double b, double result) {
        Assert.assertEquals(calculator.sub(a, b), result);
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "subLongTest", groups = "sumSub")
    public void subLongTest(long a, long b, long result) {
        Assert.assertEquals(calculator.sub(a, b), result);
    }
}
