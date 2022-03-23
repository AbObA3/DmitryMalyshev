package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;


public class BeforeTest {

    protected static Calculator calculator;

    @BeforeGroups(groups = {"multDiv", "sumSub"})
    public void initCalculator() {
        calculator = new Calculator();
    }
}
