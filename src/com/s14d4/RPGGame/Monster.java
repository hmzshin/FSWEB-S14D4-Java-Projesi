package com.s14d4.RPGGame;

public abstract class Monster {
    private String name;
    private int hisPoint;
    private double damage;

    public Monster(String name, int hisPoint, double damage) {
        this.name = name;
        this.hisPoint = hisPoint;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHisPoint() {
        return hisPoint;
    }

    public double getDamage() {
        return damage;
    }

}
