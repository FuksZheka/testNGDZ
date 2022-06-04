package mult;

public class DivOperation extends OperationBase{
    float result;
    public DivOperation() {
        super("Divide", '/');
    }

    @Override
    public int dooperation(int firstnum, int secondnum) throws Exception {

        result = (float) firstnum / (float) secondnum;
        if (result > Integer.MAX_VALUE || secondnum == 0) {
            throw new Exception("Too long result for int!");
        }
        return (int) result;

    }
}
