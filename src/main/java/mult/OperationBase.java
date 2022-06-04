package mult;

public abstract class OperationBase {
    private final String name;
    private final char symbol;

    public OperationBase(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract int dooperation(int firstnum, int secondnum) throws Exception;
}
