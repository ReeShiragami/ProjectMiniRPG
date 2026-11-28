package rpg.effect;

public class AtkBuff extends StatusEffect {
    private final double multiplier;

    public AtkBuff(double multiplier, int duration) {
        super("ATK Buff", duration);
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}