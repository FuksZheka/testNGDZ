import animals.Animal;

import animals.Carnivorous;
import animals.Sizelist;
import animals.carnivorous.Catfish;
import animals.carnivorous.Tiger;
import animals.carnivorous.Wolf;
import animals.herbivore.Beaver;
import animals.herbivore.Cow;
import food.Grass;
import food.Meat;
import food.WrongFoodException;

import java.util.HashSet;

public class enclosure<T extends Animal> {


    public Sizelist Size;


    public static void main(String[] args) {

        Grass TravaMurava = new Grass(8, 7);
        Meat Myasko = new Meat(10, 100);
        Meat Fishi_Fishi = new Meat(8, 100500);

        Wolf Igor = new Wolf("Igor", 5, 50, "Igor snova govorit", Sizelist.ExtralongKingSize);
        Tiger Sherhan = new Tiger("Sherhan", 10, 150, "Meow", Sizelist.Big);
        Beaver Bibor = new Beaver("Viktor", 100, 10, "KUSAAAAAAAAAAAAAAT'", Sizelist.Middle);
        Cow Nastya = new Cow("Nastya", 0, 500, "MOOOOOOOOOOOOU", Sizelist.Big);
        Wolf Pasha = new Wolf("Pasha", -50000, 2150, "Bit' ludey bolshoy palkoy sosiska", Sizelist.Middle);
        Tiger Mihail = new Tiger("Igor", 5, 5000, "AUF", Sizelist.Big);
        Catfish DyadyaKarp = new Catfish("Peskar IvanbI4", 15, 5, Sizelist.Small);
        Catfish TyanKarp = new Catfish("Peskar IvanbI4", 15, 5, Sizelist.Small);

        Worker Petya = new Worker("PETACHOK");

        enclosure<Carnivorous> hishniki = new enclosure<Carnivorous>(Sizelist.ExtralongKingSize);

        System.out.println("\tTry to add extrabig wolf named Igor");
        hishniki.adding(DyadyaKarp);
        System.out.println("\tTry to add Catfish");
        hishniki.adding(TyanKarp);
        System.out.println("\t Try to add Catfish with a wrong name");
        hishniki.adding(Sherhan);
        System.out.println("\tTry to add tiger named Sherhan");
        hishniki.adding(Pasha);
        System.out.println(("\tTry to add wolf named Pasha"));
        hishniki.adding(Mihail);
        System.out.println("\tTry to add tiger named Mihail");
        System.out.println(hishniki.getCage());

        //Petya.feed(Sherhan,Myasko);
        //Petya.feed(Sherhan,TravaMurava);


        /*try {
            Sherhan.eat(TravaMurava);
        } catch (WrongFoodException e) {
            e.printStackTrace(System.out);
        }
        try {
            Sherhan.eat(Myasko);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
*/

        System.out.println("PERERbiB");
        hishniki.getHash("Igor");
        hishniki.getHash("Pasha");
        hishniki.getHash("hoy");
        hishniki.getHash("Peskar IvanbI4");
        System.out.println("Finds of Peskar IvanbI4");

        Petya.feed(hishniki.getHash("Peskar IvanbI4"), Fishi_Fishi);
        Petya.feed(hishniki.getHash("Peskar IvanbI4"), TravaMurava);

        hishniki._remove1(Pasha);
        hishniki._remove1(DyadyaKarp);

        System.out.println(hishniki.getCage());
    }

    public enclosure(Sizelist Size) {
        this.Size = Size;
    }

    public void print() {
        //System.out.println(Gav);
        //System.out.println(Gav.toString());
        //System.out.println(Gav.getClass());
    }

    public void adding(T novoeJivotnoe) {
        if (novoeJivotnoe.getAnimalsize().getSize() + this.Sizecheck() <= this.Size.getSize()) {

            for (T Jivotnoe : cage) {
                if (Jivotnoe.equals(novoeJivotnoe)) {
                    System.out.println("Animal with this animalName already exist");
                    return;
                }
            }
            cage.add(novoeJivotnoe);
            System.out.println("Animal is correct for adding");
        } else {
            System.out.println("Size of animal too big right now");
        }
    }

    public void _remove1(T animal) {
        cage.remove(animal);
        System.out.println("Animal " + animal + " has been removed");
    }

    private HashSet<T> cage = new HashSet<T>();

    private int Sizecheck() {
        int count = 0;
        for (Animal animals : cage) {
            count += animals.getAnimalsize().getSize();
        }
        return count;
    }

    public HashSet<T> getCage() {
        return cage;
    }

    public T getHash(String name) {
        boolean f = false;
        for (T Animal : cage) {
            if (Animal.getName() == name) {
                System.out.println(Animal);
                return Animal;
            } else {
                f = true;
            }
        }
        if (f) {
            System.out.println("Animal has not been founded. We are sorry");
        }

        return null;
    }

}









