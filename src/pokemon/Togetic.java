package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Togetic extends Togepi {
    public Togetic(String name, int level){
        super(name, level);
        // Тип Сверкающий и Летающий, Здоровье 55, Атака 40, Защита 85, Специальная атака 80, Специальная защита 105, Скорость 40
        setType(Type.FAIRY, Type.FLYING);
        setStats(55, 40, 85, 80, 105, 40);
        this.addMove(new Growl());
    }
}
