import animals.Animal;
import animals.Carnivorous;
import animals.carnivorous.Tiger;
import animals.carnivorous.Wolf;
import animals.herbivore.Beaver;
import animals.herbivore.Cow;
import animals.herbivore.Duck;
import food.Food;
import food.WrongFoodException;


public class Worker {
    public String workerName;

    public void feed(Animal animalType, Food foodType) {
        try {
            animalType.eat(foodType);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

        System.out.println(workerName+" feed "+ animalType.getName());
    }

    public void getVoice(Beaver beaver) {
        System.out.println(beaver.voice());
    }
    public void getVoice(Tiger tiger) {
        System.out.println(tiger.voice());
    }
    public void getVoice(Wolf wolf) {
        System.out.println(wolf.voice());
    }
    public void getVoice(Cow cow) {
        System.out.println(cow.voice());
    }
    public void getVoice(Duck duck) {
        System.out.println(duck.voice());
    }

    public Worker(String name){this.workerName=name;}
}
