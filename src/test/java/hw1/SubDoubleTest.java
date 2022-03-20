package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubDoubleTest {
    @Test(dataProviderClass = DataProviders.class,dataProvider = "subDoubleTest",groups = "sumSub")
    public void simpleTest(double a, double b, double result){
        Calculator calculator= new Calculator();
        Assert.assertEquals(calculator.sub(a,b),result);

    }
}
