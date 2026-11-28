package rpg.effect;

public class Bleed extends DamageOverTime {
    public Bleed(int sourceAtk, int duration) {
        super("Bleed", (int) Math.round(sourceAtk * 0.25), duration);
    }
}