package food;

public class Food {
    protected int satiety;
    protected int taste;

    public Food(int satiety, int taste) {
        this.satiety = satiety;
        this.taste = taste;
    }

    public int getSatiety() {
        return satiety;
    }
}
