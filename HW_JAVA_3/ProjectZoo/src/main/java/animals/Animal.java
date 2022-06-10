package animals;

import food.Food;
import food.WrongFoodException;
import java.util.Objects;

public class Animal {
    String name;
    int prettiness;
    int weight;
    int satiety;
    Sizelist animalsize;


    public String getName() {
        return this.name;
    }

    public void eat(Food food) throws WrongFoodException {
        this.satiety += food.getSatiety();
    }

    Animal(String name, int prettiness, int weight, Sizelist size) {
        this.name = name;
        this.prettiness = prettiness;
        this.weight = weight;
        this.satiety = 15;
        this.animalsize = size;
    }

    public Sizelist getAnimalsize() {
        return animalsize;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this.getClass() != o.getClass()) {
            return false;
        }
        return this.name == ((Animal) o).name;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
