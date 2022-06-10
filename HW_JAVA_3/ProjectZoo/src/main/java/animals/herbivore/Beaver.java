package animals.herbivore;

import animals.Herbivore;
import animals.Sizelist;
import animals.intetface.Run;
import animals.intetface.Swim;
import animals.intetface.Voice;

public class Beaver extends Herbivore implements Swim, Voice, Run {
    String voice = "";

    public Beaver(String name, int prettiness, int weight, String voice, Sizelist size) {
        super(name, prettiness, weight, size);
        this.voice = voice;
    }
    @Override
    public void run() {
        System.out.println(" HE CAN RUUUUUUUUUUUUUUUUUN, running in the 90's.mp3 ");
    }

    @Override
    public String voice() {
        return this.voice;
        // System.out.println("Let me show my voice" + voice);
    }
    @Override
    public void swim() {
        System.out.println("Ti menya ne dogonish, bul' bul' bul'");
    }
}

