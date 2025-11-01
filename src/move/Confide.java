package move;

import ru.ifmo.se.pokemon.*;

public final class Confide extends StatusMove {
    public Confide() {
        // Статическая атака: Тип Нормальный, Мощность 0, Точность 100, Приоритет 0, Использование 1
        super(Type.NORMAL, 0, 100, 0, 1);
    }

    // На один ход специальная атака покемона противника понижается на -1
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect eff = new Effect().turns(1).stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "играет в игру на доверие";
    }
}
