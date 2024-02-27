package com.s14d4.RPGGame;

public class Troll extends Monster implements Bleedable, Poisonable {
    public Troll(String name, int hisPoint, double damage) {
        super(name, hisPoint, damage);

    }

    @Override
    public double bleed() {
        return super.getDamage() * 0.25;

    }

    @Override
    public double poison() {
        return super.getDamage() * 0.3;
    }

    public double attack() {
        return this.getDamage() + this.bleed() + this.poison();
    }
}
