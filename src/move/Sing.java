package move;

import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove {
    public Sing() {
        // Статическая атака: Тип Нормальный, Мощность 0, Точность 55, Приоретет 0, Использование 1
        super(Type.NORMAL, 0, 55, 0, 1);
    }

    //Востанавливает здоровье союзного покемона
    @Override public void applySelfEffects(Pokemon self) {
        self.addEffect(new Effect().stat(Stat.HP, 1));
    }

    @Override public String describe() {
        return "поёт исцеляющую песню";
    }
}
