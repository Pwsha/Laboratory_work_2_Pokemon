package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Minccino extends Pokemon {
    public Minccino(String name, int level){
        super(name, level);
        // Тип Нормальный, Здоровье 55, Атака 50, Защита 40, Специальная атака 40, Специальная защита 60, Скорость 75
        setType(Type.NORMAL);
        setStats(55,50,40,40,60,75);
        this.addMove(new DazzlingGleam());
        this.addMove(new Sing());
        this.addMove(new Swagger());
    }
}