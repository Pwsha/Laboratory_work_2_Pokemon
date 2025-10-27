package move;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        // Физическая атака: Тип Воздушная, Мощность 60, Точность +бесконечность, Приоретет 0, Использование 1
        super(Type.FLYING, 60, Double.POSITIVE_INFINITY, 0, 1);
    }

    @Override public String describe(){
        return "использует воздушную атаку";
    }
}
