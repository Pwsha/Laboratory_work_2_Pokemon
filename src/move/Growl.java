package move;

import ru.ifmo.se.pokemon.*;

public final class Growl extends StatusMove {
    public Growl() {
        // Статическая атака: Тип Нормальный, Мощность 0, Точность 100, Приоритет 0, Использование 1
        super(Type.NORMAL, 0, 100, 0, 1);
    }

    // На один ход атака покемона противника понижается на -1
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect eff = new Effect().turns(1).stat(Stat.ATTACK,-1);
        p.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "рычит на соперника";
    }
}
