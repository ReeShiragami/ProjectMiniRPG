package rpg.effect;

public class Burn extends DamageOverTime {
    public Burn(int sourceAtk, int duration) {
        super("Burn", (int) Math.round(sourceAtk * 0.30), duration);
    }
}