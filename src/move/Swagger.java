package move;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {
    public Swagger() {
        // Статическая атака: Тип Нормальная, Мощность 0, Точность 85, Приоретет 0, Использование 1
        super(Type.NORMAL, 0, 85, 0, 1);
    }

    // Запугивает покемона соперника и поднимает его атаку на 2
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.addEffect(new Effect().stat(Stat.ATTACK,2));
    }

    @Override
    protected String describe() {
        return "исполняет перебежку";
    }
}
