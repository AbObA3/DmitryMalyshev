package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultDoubleTest {
    @Test(dataProviderClass = DataProviders.class,dataProvider = "multDoubleTest",groups = "multDiv")
    public void multDoubleTest(double a, double b , double result){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.mult(a,b),result);
    }
}
