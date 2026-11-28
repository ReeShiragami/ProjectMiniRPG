package rpg.effect;

import rpg.model.Character;

public abstract class StatusEffect {
    protected String name;
    protected int duration;

    public StatusEffect(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public void onTurnEnd(Character target) {
        
    }

    public void decrementDuration() {
        this.duration--;
    }

    public boolean isExpired() {
        return this.duration <= 0;
    }

    public void refreshDuration(int newDuration) {
        this.duration = Math.max(this.duration, newDuration);
    }

    public String getName() { return name; }
    public int getDuration() { return duration; }
}