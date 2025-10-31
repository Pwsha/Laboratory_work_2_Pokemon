package move;

import ru.ifmo.se.pokemon.*;

public final class DazzlingGleam extends SpecialMove {
    public DazzlingGleam() {
        // Специальная атака: Тип Сияющий, Мощность 80, Точность 100, Приоретет 0, Использование 1
        super(Type.FAIRY, 80, 100, 0, 1);
    }

    @Override
    protected String describe() {
        return "использует атаку с блеском";
    }
}
