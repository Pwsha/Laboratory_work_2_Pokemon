package move;

import ru.ifmo.se.pokemon.*;

public final class SteelWing extends PhysicalMove {
    public SteelWing() {
        // Физическая атака: Тип Сталь, Мощность 70, Точность 90, Приоритет 0, Использование 1
        super(Type.STEEL, 70, 90, 0, 1);
    }

    //С шансем 10 процентов повышает защиту союзного покемона на +1
    @Override
    protected void applySelfEffects(Pokemon self) {
        Effect eff = new Effect().chance(0.1).turns(1).stat(Stat.DEFENSE, 1);
        self.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "атакует своими стальными крыльями";
    }
}
