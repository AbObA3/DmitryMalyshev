package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivLongTest {
    @Test(dataProviderClass = DataProviders.class, dataProvider = "divLongTest",groups = "multDiv")
    public void divLongTest(long a , long b, long result){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.div(a,b),result);
    }
}
