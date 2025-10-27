package move;

import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {
    public Growl() {
        // Статическая атака: Тип Нормальный, Мощность 0, Точность 100, Приоретет 0, Использование 1
        super(Type.NORMAL, 0, 100, 0, 1);
    }

    // На один ход атака покемона противника понижается на -1
    @Override public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().turns(1).stat(Stat.ATTACK,-1));
    }

    @Override public String describe(){
        return "рычит на соперника";
    }
}
