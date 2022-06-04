package mult;

public class MultOperation extends OperationBase {
    long result;

    public MultOperation() {
        super("Multiply", '*');
    }
    @Override
    public int dooperation(int firstnum, int secondnum) throws Exception {

        result = (long) firstnum * (long) secondnum;
        if (result > Integer.MAX_VALUE ||result < Integer.MIN_VALUE) {
            throw new Exception("Too long result for int!");
        }
        return (int) result;
    }
}
