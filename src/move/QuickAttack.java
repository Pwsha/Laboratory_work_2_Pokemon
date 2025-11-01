package move;

import ru.ifmo.se.pokemon.*;

public final class QuickAttack extends PhysicalMove{
    public QuickAttack() {
        // Физическая атака: Тип Нормал, Мощность 40, Точность 100, Приоритет 0, Использование 1
        super(Type.NORMAL, 40, 100, 0, 1);
    }

    @Override
    protected String describe(){
        return "использует быструю атаку";
    }
}
