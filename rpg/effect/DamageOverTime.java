package rpg.effect;

import rpg.model.Character;

public abstract class DamageOverTime extends StatusEffect {
    protected int damagePerTurn;

    public DamageOverTime(String name, int damagePerTurn, int duration) {
        super(name, duration);
        this.damagePerTurn = damagePerTurn;
    }

    @Override
    public void onTurnEnd(Character target) {
        target.takeTrueDamage(damagePerTurn);
    }

    public int getDamagePerTurn() {
        return damagePerTurn;
    }
}