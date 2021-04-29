package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean hasArmor = true;

    Swordsman(boolean isArmored) {
        super(100, 10, isArmored);
    }

    @Override
    public void sufferDamage(int damage) {
        if (hasArmor) {
            damage = 0;
            hasArmor = false;
        }
        super.sufferDamage(damage);
    }
}