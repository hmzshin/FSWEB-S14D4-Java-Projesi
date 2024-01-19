package com.s14d4.RPGGame;

public class Troll extends Monster {
    public Troll(String name, int hisPoint, double damage) {
        super(name, hisPoint, damage);

    }

    @Override
    public double bleed() {
        return super.getDamage() * 0.3;

    }
}
