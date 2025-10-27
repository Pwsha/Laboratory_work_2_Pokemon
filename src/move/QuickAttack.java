package move;

import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove{
    public QuickAttack() {
        // Физическая атака: Тип Нормал, Мощность 40, Точность 100, Приоретет 0, Использование 1
        super(Type.NORMAL, 40, 100, 0, 1);
    }

    @Override public String describe(){
        return "использует быструю атаку";
    }
}
