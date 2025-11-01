package move;

import ru.ifmo.se.pokemon.*;

public final class DreamEater extends SpecialMove {
    public DreamEater() {
        // Специальная атака: Тип Психический, Мощность 100, Точность 100, Приоритет 0, Использование 1
        super(Type.PSYCHIC, 100, 100, 0, 1);
    }
    // Вспомогательные переменные состояния и здоровья
    public boolean state = false;
    public int heal = 0;

    // Покемон наносит урон только если спит покемон противника
    @Override
    protected void applyOppDamage(Pokemon p, double dmg){
        state = false;
        heal = 0;
        if (p.getCondition() == Status.SLEEP) {
            state = true;
            heal = (int) dmg / 2;
        }
    }

    // Востанавливает здоровье союзному покемону в размере нанесённого урона противнику
    @Override
    protected void applySelfEffects(Pokemon self){
        if (state){
            Effect eff = new Effect().stat(Stat.HP, (int) self.getHP() + heal);
            self.addEffect(eff);
        }
    }

    @Override
    protected String describe(){
        return "начинает поедать мечты и надежды соперника";
    }
}
