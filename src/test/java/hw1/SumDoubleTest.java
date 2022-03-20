package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleTest {
    @Test(dataProviderClass = DataProviders.class, dataProvider = "sumDoubleTest",groups = "sumSub")
    public void simpleTest(double a,double b, double result){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sum(a,b),result);
    }
}
