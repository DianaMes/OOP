package OOP.sem2.correct;

import java.util.List;

public class Zoosound {

    List<Speakable> speakableList;

    public Zoosound(List<Speakable> speakableList) {
        this.speakableList = speakableList;
    }

    public void speakAll() {
        for (Speakable speakable : speakableList) {
            speakable.speak();
        }

    }

}