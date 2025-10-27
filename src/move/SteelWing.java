package move;

import ru.ifmo.se.pokemon.*;

public class SteelWing extends PhysicalMove {
    public SteelWing() {
        // Физическая атака: Тип Сталь, Мощность 70, Точность 90, Приоретет 0, Использование 1
        super(Type.STEEL, 70, 90, 0, 1);
    }

    //С шансем 10 процентов повышает защиту союзного покемона на +1
    @Override public void applySelfEffects(Pokemon self) {
        self.addEffect(new Effect().chance(0.1).turns(1).stat(Stat.DEFENSE, 1));
    }

    @Override public String describe(){
        return "атакует своими стальными крыльями";
    }
}
