package animals.herbivore;

import animals.Herbivore;
import animals.Sizelist;
import animals.intetface.Run;
import animals.intetface.Voice;


public class Cow extends Herbivore implements Run, Voice {
    String voice = "";

    public Cow(String name, int prettiness, int weight, String voice, Sizelist size) {
        super(name, prettiness, weight, size);
        this.voice = voice;
    }

    @Override
    public String voice() {
        return this.voice;
        // System.out.println("Let me show my voice" + voice);
    }

    @Override
    public void run() {
        System.out.println(" HE CAN RUUUUUUUUUUUUUUUUUN, running in the 90's.mp3 ");
    }
}
