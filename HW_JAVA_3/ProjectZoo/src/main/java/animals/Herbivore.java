package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, int prettiness, int weight, Sizelist size) {
        super(name, prettiness, weight, size);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            super.eat(food);
            System.out.println("That's right choose");
         //}else {

            //System.out.println("I can't it. It's a murder");
            throw new WrongFoodException();
        }
    }
}
