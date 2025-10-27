package game;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Pokemon_Battle {
    public static void main(String[] args) {
        Battle b = new Battle();
        //первая команда
        b.addAlly(new Cinccino("Мега-Мышка", 10));
        b.addAlly(new Zangoose("Гусь", 10));
        b.addAlly(new Togetic("Подросток-белёк", 10));
        //вторая команда
        b.addFoe(new Togekiss("Птица-белёк",10));
        b.addFoe(new Togepi("Яичко-белёк",10));
        b.addFoe(new Minccino("Мышка",10));
        b.go();
    }
}