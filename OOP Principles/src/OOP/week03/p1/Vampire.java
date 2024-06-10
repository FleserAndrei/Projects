package OOP.week03.p1;

public class Vampire extends Monster{

    private boolean bloodLust = true;
    public Vampire() {
        this.setAttackStrength(10);
        this.setDefense(10);
        this.setHealthPoints(50);
        System.out.println("An Vampire just appeared!");
    }

    public boolean hasBloodLust() {
        return bloodLust;
    }

    public void setBloodLust(boolean bloodLust) {
        this.bloodLust = bloodLust;
    }
}
