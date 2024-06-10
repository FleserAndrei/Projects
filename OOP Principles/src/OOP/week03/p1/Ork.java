package OOP.week03.p1;

public class Ork extends Monster {

    private boolean divineShiled = true;

    public Ork() {
        this.setAttackStrength(10);
        this.setDefense(10);
        this.setHealthPoints(50);
        System.out.println("An Ork just appeared!");
    }

    public boolean hasDivineShiled() {
        return divineShiled;
    }

    public void setDivineShiled(boolean divineShiled) {
        this.divineShiled = divineShiled;
    }
}
