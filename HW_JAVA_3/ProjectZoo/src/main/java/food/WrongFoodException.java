package food;

public class  WrongFoodException extends Exception{
    public WrongFoodException(){
        super("It's a misery. Uncorrected food type, attention please");
    }
}
