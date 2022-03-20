package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultLongTest {
    @Test(dataProviderClass = DataProviders.class,dataProvider = "multLongTest",groups = "multDiv")
    public void simpleTest(long a,long b, long result){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.mult(a,b),result);
    }
}
