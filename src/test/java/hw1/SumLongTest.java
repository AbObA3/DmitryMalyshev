package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongTest {
    @Test(dataProviderClass = DataProviders.class,dataProvider = "sumLongTest",groups = "sumSub")
    public void sumLongTest(Long a, Long b, Long result){
        Calculator calculator=new Calculator();
        Assert.assertEquals(calculator.sum(a,b),result);
    }

}
