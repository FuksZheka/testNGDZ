package animals.herbivore;

import animals.Herbivore;
import animals.Sizelist;
import animals.intetface.Fly;
import animals.intetface.Swim;
import animals.intetface.Voice;

public class Duck extends Herbivore implements Swim, Fly, Voice {
    String voice = "";

    public Duck(String name, int prettiness, int weight, String voice, Sizelist size) {
        super(name, prettiness, weight, size);
        this.voice = voice;
    }

    @Override
    public void fly() {
        System.out.println("I can FLY!!! I can't believe it");
    }
    @Override
    public void swim() {
        System.out.println("I swim! I call you to fight me stupid fcking fish ");
    }
    @Override
    public String voice() {
        return this.voice;
        // System.out.println("Let me show my voice" + voice);
    }
}