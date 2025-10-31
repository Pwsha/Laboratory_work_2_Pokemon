package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public final class Zangoose extends Pokemon {
    public Zangoose(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(73,115,60,60,60,90);
        this.addMove(new QuickAttack());
        this.addMove(new Scratch());
        this.addMove(new AerialAce());
        this.addMove(new FocusBlast());
    }
}
