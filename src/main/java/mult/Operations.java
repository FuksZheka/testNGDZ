package mult;

public enum Operations {
    Sum(new SumOperation()),
    Multiply(new MultOperation()),
    Subtraction(new SubOperation()),
    Divide(new DivOperation());

    private final OperationBase operationBase;

    Operations(OperationBase operationBase) {
        this.operationBase = operationBase;
    }

    public OperationBase getCalculationVar() {
        return operationBase;
    }

    public static Operations finds(char symbol) {
        for (Operations value : values()) {
        if(value.getCalculationVar().getSymbol() == symbol)
            return value;
        }
        throw new IllegalArgumentException("Incorrect Operation" + symbol);
    }
}
