package move;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        // Статическая атака: Тип Нормальный, Мощность 0, Точность 0, Приоретет 0, Использование 1
        super(Type.NORMAL, 0, 0, 0, 1);
    }

    // На один ход специальная атака покемона противника понижается на -1
    @Override public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().turns(1).stat(Stat.SPECIAL_ATTACK,-1));
    }

    @Override public String describe(){
        return "играет в игру на доверие";
    }
}
