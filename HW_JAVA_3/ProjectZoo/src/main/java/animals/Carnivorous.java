package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {
    public Carnivorous(String name, int prettiness, int weight, Sizelist size) {
        super(name, prettiness, weight, size);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            super.eat(food);
            System.out.println("Right food type");

        } else {
            throw new WrongFoodException();
//            System.out.println("It's a misery. Uncorrected food type, attention please");
        }
    }

}
