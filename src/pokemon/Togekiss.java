package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public final class Togekiss extends Togetic {
    public Togekiss(String name, int level){
        super(name, level);
        // Тип Сверкающий и Летающий, Здоровье 85, Атака 50, Защита 95, Специальная атака 120, Специальная защита 115, Скорость 80
        setType(Type.FAIRY, Type.FLYING);
        setStats(85,50,95,120,115,80);
        this.addMove(new SteelWing());
    }
}
