package move;

import ru.ifmo.se.pokemon.*;

public final class AerialAce extends PhysicalMove {
    public AerialAce() {
        // Физическая атака: Тип Воздушная, Мощность 60, Точность +бесконечность, Приоритет 0, Использование 1
        super(Type.FLYING, 60, Double.POSITIVE_INFINITY, 0, 1);
    }

    @Override
    protected String describe(){
        return "использует воздушную атаку";
    }
}
