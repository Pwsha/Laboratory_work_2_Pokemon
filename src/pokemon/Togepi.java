package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Togepi extends Pokemon {
    public Togepi(String name, int level){
        super(name, level);
        // Тип Сверкающий, Здоровье 35, Атака 20, Защита 65, Специальная атака 40, Специальная защита 65, Скорость 20
        setType(Type.FAIRY);
        setStats(35, 20, 65, 40, 65, 20);
        this.addMove(new Confide());
        this.addMove(new DreamEater());
    }
}
