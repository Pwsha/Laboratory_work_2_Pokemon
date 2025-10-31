package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public final class Togekiss extends Togetic {
    public Togekiss(String name, int level){
        super(name, level);
        setType(Type.FAIRY, Type.FLYING);
        setStats(85,50,95,120,115,80);
        this.addMove(new SteelWing());
    }
}
