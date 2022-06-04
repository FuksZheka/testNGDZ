package mult;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorFindsTest{
    private DigitReader reader = new ConsoleReaderClass();
    private OperationBase operation;

    @DataProvider
    public static Object[][] DataForPositiveTest() {
        return new Object[][]{
                {6, 60, 10, Operations.Divide.getCalculationVar()},
                {5, 55, 11, Operations.Divide.getCalculationVar()},
                {110, 770, 7, Operations.Divide.getCalculationVar()},
                {600, 60, 10, Operations.Multiply.getCalculationVar()},
                {50, 10, 5, Operations.Multiply.getCalculationVar()},
                {1900, 10, 190, Operations.Multiply.getCalculationVar()},
                {1984, 84, 1900, Operations.Sum.getCalculationVar()},
                {2022, 1917, 105, Operations.Sum.getCalculationVar()},
                {24, 26, 2, Operations.Subtraction.getCalculationVar()}
        };
    }

    @DataProvider
    public static Object[][] DataForNegativeTest() {
        return new Object[][]{
                {61, 60, 10, Operations.Divide.getCalculationVar()},
                {1110, 770, 0, Operations.Divide.getCalculationVar()},
                {6001, 60, 10, Operations.Multiply.getCalculationVar()},
                {19010, 10, 19, Operations.Multiply.getCalculationVar()},
                {20221, 1917, 105, Operations.Sum.getCalculationVar()},
                {24, 256, 2, Operations.Subtraction.getCalculationVar()}
        };
    }
    @DataProvider
    public static Object[][] DataForOversizeTest() {
        return new Object[][]{

                {2147483647, 2147483647, 10, Operations.Multiply.getCalculationVar()},
                {2147483647, 2147483647, 105, Operations.Sum.getCalculationVar()},
                {2147483647, 2147483647, 10505455, Operations.Sum.getCalculationVar()},
        };
    }



    @Test(dataProvider = "DataForPositiveTest")
    public void calculationTest(Object[] data) throws Exception {
        OperationBase operationBase = (OperationBase) data[3];
        int result = (int) data[0];
        int first = (int) data[1];
        int second = (int) data[2];
        Assert.assertEquals(result,operationBase.dooperation(first, second));
    }

    @Test(dataProvider = "DataForNegativeTest")
    public void wrongcalculationTest(Object[] data) throws Exception {
        OperationBase operationBase = (OperationBase) data[3];
        int result = (int) data[0];
        int first = (int) data[1];
        int second = (int) data[2];
        Assert.assertEquals(operationBase.dooperation(first, second), result);
    }

    @Test(dataProvider = "DataForOversizeTest")
    public void OversizecalculationTest(Object[] data) throws Exception {
        OperationBase operationBase = (OperationBase) data[3];
        int result = (int) data[0];
        int first = (int) data[1];
        int second = (int) data[2];
        try {
            Assert.assertEquals(operationBase.dooperation(first, second), result);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
//значение инт 2147483647








    /*@Test(dataProvider="CalculationData")

    @DataProvider(name="data-provider")
    public Object[][] findstest(){
        Operations result = Operations.finds('-');
        return new Object[0][];
    }
}*/
