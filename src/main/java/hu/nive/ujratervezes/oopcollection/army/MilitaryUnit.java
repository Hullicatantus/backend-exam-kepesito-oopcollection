package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private int damage;
    private int vitality;
    private boolean armor;

    MilitaryUnit(int vitality, int damage, boolean armor){
        this.damage = damage;
        this.vitality = vitality;
        this.armor = armor;
    }

    public void sufferDamage(int damage){
        int damageCaused = (armor) ? damage / 2 : damage;
        this.vitality -= damageCaused;
    }

    public int getHitPoints() {
        return vitality;
    }

    public int doDamage() {
        return this.damage;
    }

}
