package move;

import ru.ifmo.se.pokemon.*;

public final class Sing extends StatusMove {
    public Sing() {
        // Статическая атака: Тип Нормальный, Мощность 0, Точность 55, Приоретет 0, Использование 1
        super(Type.NORMAL, 0, 55, 0, 1);
    }

    //Усыпляет покемона противника на 1-3 хода
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect eff = new Effect().condition(Status.SLEEP).turns((int) rand(1,3));
        p.addEffect(eff);
        p.restore();
    }

    @Override
    protected String describe() {
        return "поёт усыпляющую песню";
    }

    //метод для случайной генерации использования атаки
    private static double rand(int min, int max){
        return Math.random() * (max - min) - min;
    }
}
