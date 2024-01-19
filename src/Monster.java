public abstract class Monster implements Bleedable, Poisonable {
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

    @Override
    public double bleed() {
        return this.getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return this.getDamage() * 0.3;
    }
    
    public double attack() {
        return this.getDamage() + this.bleed() + this.poison();
    }

}
