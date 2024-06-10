package OOP.week03.p1;

public class Entity {

    private int healthPoints = 0;
    private int attackStrength = 0;
    private int defense = 0;

    public int getHealthPoints(){
        return this.healthPoints;
    }
    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public int getAttackStrength(){
        return this.attackStrength;
    }
    public void setAttackStrength(int attackStrength){
        this.attackStrength = attackStrength;
    }

    public int getDefense(){
        return this.defense;
    }
    public void setDefense(int defense){
        this.defense = defense;
    }

}
