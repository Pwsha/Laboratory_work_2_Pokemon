import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Pokemon_Battle {
    public static void main(String[] args) {
        Battle b = new Battle();
        //первая команда
        b.addAlly(new Zangoose("Гусь", 30));
        b.addAlly(new Togetic("Подросток-белёк", 30));
        b.addAlly(new Cinccino("Мега-Мышка", 30));
        //вторая команда
        b.addFoe(new Togepi("Яичко-белёк",15));
        b.addFoe(new Togekiss("Птица-белёк",15));
        b.addFoe(new Minccino("Мышка",15));
        b.go();
    }
}