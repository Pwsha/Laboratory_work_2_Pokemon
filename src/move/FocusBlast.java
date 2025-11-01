package move;

import ru.ifmo.se.pokemon.*;

public final class FocusBlast extends SpecialMove {
    public FocusBlast() {
        // Специальная атака: Тип Боевой, Мощность 120, Точность 70, Приоритет 0, Использование 1
        super(Type.FIGHTING, 120, 70, 0, 1);
    }

    // С шансем 10 процентов специальная защита покемона противника снижается до -1
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect eff = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE,-1);
        p.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "использует специальную взрывную атаку";
    }
}
