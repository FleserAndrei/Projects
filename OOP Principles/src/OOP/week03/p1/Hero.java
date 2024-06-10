package OOP.week03.p1;

public class Hero extends Entity{

    private String name;
    private int experiencePoints = 0;

    public Hero(String name) {
        this.setAttackStrength(15);
        this.setDefense(8);
        this.setHealthPoints(1000);
        this.name = name;
        System.out.println("The hero " + name + " just appeared!" + this.getHealthPoints() + " HP!");
    }

    public String getName() {
        return name;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
}
