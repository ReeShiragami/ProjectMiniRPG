package rpg.battle;

public class PercentageReduction implements DamageFormula {
    @Override
    public int calculate(int atk, int def) {
        double multiplier = 100.0 / (100.0 + def);
        return Math.max(1, (int) Math.round(atk * multiplier));
    }
}