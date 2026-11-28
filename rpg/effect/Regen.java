package rpg.effect;

import rpg.model.Character;

public class Regen extends StatusEffect {
    private final double healPercent;

    public Regen(double healPercent, int duration) {
        super("Regen", duration);
        this.healPercent = healPercent;
    }

    @Override
    public void onTurnEnd(Character target) {
        int healAmount = (int) Math.round(target.getMaxHp() * healPercent);
        target.heal(healAmount);
    }
}