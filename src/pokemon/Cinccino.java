package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Cinccino extends Minccino{
    public Cinccino(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(75,95,60,65,60,115);
        this.addMove(new RockBlast());
    }
}
