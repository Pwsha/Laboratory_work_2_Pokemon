package move;

import ru.ifmo.se.pokemon.*;

public class RockBlast extends PhysicalMove {
    public RockBlast() {
        // Статическая атака: Тип Рок, Мощность 25, Точность 90, Приоретет 0, Использование 2-5
        super(Type.ROCK, 25, 90, 0, (int) rand(2,5));
    }

    @Override public String describe() {
        return "использует роковый приём";
    }

    //метод для случайной генерации использования атаки
    public static double rand(int min, int max){
        return Math.random() * (max - min) - min;
    }
}
