package mult;

import java.util.Scanner;

public class ConsoleReaderClass implements DigitReader{



    private Scanner sc = new Scanner(System.in);

    @Override
    public int readfirst() {
        return sc.nextInt();
    }

    @Override
    public int readsecond() {
        return sc.nextInt();
    }

    @Override
    public OperationBase readOperation() {
        return Operations.finds(sc.next().charAt(0)).getCalculationVar();
    }
}
