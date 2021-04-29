package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {
    private boolean charge = true;

    HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        if (charge) {
            charge = false;
            return super.doDamage() * 3;
        } else {
            return super.doDamage();
        }
    }
}