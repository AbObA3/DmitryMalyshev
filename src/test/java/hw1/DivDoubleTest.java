package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivDoubleTest {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "divDoubleTest",groups = "multDiv")
    public void divDoubleTest(double a, double b, double result){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.div(a,b),result);
    }
}
