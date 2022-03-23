package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BeforeTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "sumDoubleTest", groups = "sumSub")
    public void sumDoubleTest(double a, double b, double result) {
        Assert.assertEquals(calculator.sum(a, b), result);
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "sumLongTest", groups = "sumSub")
    public void sumLongTest(Long a, Long b, Long result) {
        Assert.assertEquals(calculator.sum(a, b), result);
    }
}
