package model;

public class Player extends Character {
    private boolean isDodging = false;

    public Player(String name, int maxHp, int def, int atk){
        super(name, maxHp, def, atk);
    }

    public void setDodging(boolean dodging) {
        this.isDodging = dodging;
    }

    @Override
    public void takeDamage(int incomingDamage) {
        if (this.isDodging) {
            this.isDodging = false;
            if (Math.random() < 100.0) {
                System.out.println(this.name + " berhasil menghindar");
                return;
            } else {
                System.out.println(this.name + " gagal menghindar");
            }
        }

        super.takeDamage(incomingDamage);
    }
}