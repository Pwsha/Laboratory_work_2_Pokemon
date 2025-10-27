package move;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater() {
        // Специальная атака: Тип Психический, Мощность 100, Точность 100, Приоретет 0, Использование 1
        super(Type.PSYCHIC, 100, 100, 0, 1);
    }

    // Востанавливает 50 процентов здоровья союзному покемону
    @Override public void applySelfEffects(Pokemon self) {
        self.addEffect(new Effect().stat(Stat.HP, 5));
    }

    @Override public String describe(){
        return "начинает поедать мечты и надежды соперника";
    }
}
