package move;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast() {
        // Специальная атака: Тип Боевой, Мощность 120, Точность 70, Приоретет 0, Использование 1
        super(Type.FIGHTING, 120, 70, 0, 1);
    }

    // С шансем 10 процентов специальная защита покемона противника снижается до -6
    @Override public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE,-1));
    }

    @Override public String describe(){
        return "использует специальную взрывную атаку";
    }
}
