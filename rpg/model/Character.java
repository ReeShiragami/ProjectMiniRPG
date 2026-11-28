
// Belum Done
package model;

public abstract class Character {
    protected String name;
    protected int maxHp;
    protected int hp;
    protected int def;
    protected int atk;
    
    public Character(String name, int maxHp, int def, int atk) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.def = def;
        this.atk = atk;
}

public int takeDamage(int incomingDamage) {
    double multiplier = 100.0 / (100.0 + this.def);
    int finalDamage = (int) Math.round(incomingDamage * multiplier);
    this.hp = Math.max(0, this.hp - finalDamage);
    return finalDamage;
}

public void heal(int amount) {
    this.hp += amount;
    if (this.hp > this.maxHp){
        this.hp = this.maxHp;
    }
    System.out.println(this.name + " memulihkan " + amount + "HP");
}

public boolean isAlive() {
    return this.hp > 0;
}

public String getName() { return name; }
public int getHp() { return hp; }
public int getMaxHp() { return maxHp; }
public int getDef() { return def; }
public int getAtk() { return atk; }
}