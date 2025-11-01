package move;

import ru.ifmo.se.pokemon.*;

public final class RockBlast extends PhysicalMove {
    public RockBlast() {
        // Физическая атака: Тип Рок, Мощность 25, Точность 90, Приоритет 0, Использование 2-5
        super(Type.ROCK, 25, 90, 0, (int) rand(2.0, 5.0));
    }

    @Override
    protected String describe() {
        return "использует роковый приём";
    }

    //метод для случайной генерации использования атаки
    private static double rand(double min, double max){
        return Math.random() * (max - min) - min;
    }
}
