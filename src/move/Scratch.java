package move;

import ru.ifmo.se.pokemon.*;

public final class Scratch extends PhysicalMove {
    public Scratch() {
        // Физическая атака: Тип Нормальный, Мощность 40, Точность 100, Приоритет 0, Использование 1
        super(Type.NORMAL, 40, 100, 0, 1);
    }

    @Override
    protected String describe(){
        return "царапает врага";
    }
}

