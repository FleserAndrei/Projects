package OOP.week03.p1;

public class Game {

    private static int calculateDamage(Entity attacker, Entity defender) {

        int damage = attacker.getAttackStrength() - defender.getDefense();

        return Math.max(damage, 0);
    }

    private static void duel(Hero hero, Monster monster) {


        if (monster.getClass().getName() == "com.nagarro.rl.week03.p1.Ork") {

            Ork ork = (Ork) monster;


            if (ork.hasDivineShiled()) {
                System.out.println(hero.getName() + " attacks Ork, missed because Ork has Divine Shield!");
                ork.setDivineShiled(false);
                hero.setExperiencePoints(hero.getExperiencePoints() + 5);
                hero.setHealthPoints(hero.getHealthPoints() - calculateDamage(ork, hero));
                System.out.println("Ork attacks Krunker for " + calculateDamage(ork, hero) + " damage!");
                System.out.println(hero.getName() + " now has " + hero.getHealthPoints() + "HP! , " + hero.getExperiencePoints() + "XP!");
            } else {
                hero.setHealthPoints(hero.getHealthPoints() - calculateDamage(ork, hero));
                System.out.println("Ork attacks Krunker for " + calculateDamage(ork, hero) + " damage!");
                System.out.println(hero.getName() + " now has " + hero.getHealthPoints() + "HP! , " + hero.getExperiencePoints() + "XP!");
                ork.setHealthPoints(ork.getHealthPoints() - calculateDamage(hero, ork));
                hero.setExperiencePoints(hero.getExperiencePoints() + 10);
                System.out.println(hero.getName() + " attacks Ork for " + calculateDamage(hero, ork) + "damage!");
                System.out.println("Ork now has " + ork.getHealthPoints() + "HP!");
            }

        }
        if (monster.getClass().getName() == "com.nagarro.rl.week03.p1.Vampire") {

            Vampire vampire = (Vampire) monster;


            vampire.setHealthPoints(vampire.getHealthPoints() -calculateDamage(hero, vampire));
            hero.setExperiencePoints(hero.getExperiencePoints() + 10);
            System.out.println(hero.getName() + " attacks Vampire for " + calculateDamage(hero, vampire) + "damage!");
            System.out.println("Vampire now has " + vampire.getHealthPoints() + "HP!");
            hero.setHealthPoints(hero.getHealthPoints() - calculateDamage(vampire, hero));
            System.out.println("Vampire attacks Krunker for " + calculateDamage(vampire, hero) + " damage!");
            System.out.println(hero.getName() + " now has " + hero.getHealthPoints() + "HP! , " + hero.getExperiencePoints() + "XP!");

            if (vampire.hasBloodLust()) {

                hero.setHealthPoints(hero.getHealthPoints() -calculateDamage(vampire, hero));
                System.out.println("Vampire attacks Krunker for " + calculateDamage(vampire, hero) + " damage! because of bloodlust");
                System.out.println(hero.getName() + " now has " + hero.getHealthPoints() + "HP! , " + hero.getExperiencePoints() + "XP!");
                hero.setHealthPoints(hero.getHealthPoints() -calculateDamage(vampire, hero));
                System.out.println("Vampire attacks Krunker for " + calculateDamage(vampire, hero) + " damage! because of bloodlust");
                System.out.println(hero.getName() + " now has " + hero.getHealthPoints() + "HP! , " + hero.getExperiencePoints() + "XP!");
            }


        }


    }


    public static void main(String[] args) {
        Hero Krunker = new Hero("Krunker");
        Ork Azrael = new Ork();
        Vampire Dracula = new Vampire();

        duel(Krunker, Azrael);
        duel(Krunker, Azrael);
        duel(Krunker, Dracula);
        duel(Krunker, Dracula);

    }
}


