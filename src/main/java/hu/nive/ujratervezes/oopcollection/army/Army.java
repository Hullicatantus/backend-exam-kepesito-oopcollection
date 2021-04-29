package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        this.army.forEach(a -> a.sufferDamage(damage));
        this.army.removeIf(a -> a.getHitPoints() <= 25);
    }
    public int getArmyDamage() {
        //TODO visszaadja, hogy az aktuális támadással mennyi sebzést okoz a sereg összesen
            return this.army.stream().mapToInt(MilitaryUnit::doDamage).sum();
        }

    public int getArmySize() {
        return army.size();
    }
}