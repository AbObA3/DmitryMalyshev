package hw1;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "sumLongTest")
    public static Object[][] sumLongData(){
        return new Object[][] {{1L,3L,4L},{5L,2L,7L}};
    }
    @DataProvider(name = "sumDoubleTest")
    public static Object[][] sumDoubleData(){
        return new Object[][]{{3.2,4.6,7.8},{9.8,2.1,11.9}};
    }
    @DataProvider(name = "subLongTest")
    public static Object[][] subLongData(){
        return new Object[][]{{4L,3L,1L},{10L,2L,8L}};
    }
    @DataProvider(name = "subDoubleTest")
    public static Object[][] subDoubleData(){
        return new Object[][]{{9.9,1.1,8.8},{4.2,2.1,2.1}};
    }
    @DataProvider(name = "multLongTest")
    public static Object[][] multLongData(){
        return new Object[][]{{4L,3L,12L},{5L,2L,10L}};
    }
    @DataProvider(name = "multDoubleTest")
    public static Object[][] multDoubleData(){
        return new Object[][]{{2.5,2.5,6.},{4.2,2.1,8.}};
    }
    @DataProvider(name = "divLongTest")
    public static Object[][] divLongData(){
        return new Object[][]{{8L,4L,2L},{10L,2L,5L}};
    }
    @DataProvider(name = "divDoubleTest")
    public static Object[][] divDoubleData(){
        return new Object[][]{{12.25,3.5,3.5},{7.36,2.3,3.2}};
    }
}
