package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubLongTest {
    @Test(dataProviderClass = DataProviders.class, dataProvider = "subLongTest",groups = "sumSub")
    public void subLongTest(long a,long b,long result){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sub(a,b),result);

    }
}
