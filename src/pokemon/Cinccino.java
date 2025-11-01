package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public final class Cinccino extends Minccino{
    public Cinccino(String name, int level){
        super(name, level);
        // Тип Нормальный, Здоровье 75, Атака 95, Защита 60, Специальная атака 65, Специальная защита 60, Скорость 115
        setType(Type.NORMAL);
        setStats(75, 95, 60, 65, 60, 115);
        this.addMove(new RockBlast());
    }
}
