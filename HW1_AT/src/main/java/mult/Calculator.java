package mult;

public class Calculator {
    private DigitReader reader = new ConsoleReaderClass();

    public String run() throws Exception {
        System.out.println("Input first digit");
        int first = reader.readfirst();
        System.out.println("Input second digit");
        int second = reader.readsecond();
        System.out.println("input math symbol");
        OperationBase operationBase = reader.readOperation();
        return String.valueOf(operationBase.dooperation(first,second));

    }
}
