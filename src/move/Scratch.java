package move;

import ru.ifmo.se.pokemon.*;

public class Scratch extends PhysicalMove {
    public Scratch() {
        // Физическая атака: Тип Нормальный, Мощность 40, Точность 100, Приоретет 0, Использование 1
        super(Type.NORMAL, 40, 100, 0, 1);
    }

    @Override public String describe(){
        return "царапает врага";
    }
}

