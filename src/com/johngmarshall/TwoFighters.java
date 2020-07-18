package com.johngmarshall;

public class TwoFighters {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        while(fighter1.health > 0 && fighter2.health > 0) {
            if(firstAttacker.equals(fighter1.name)) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                firstAttacker = fighter2.name;
            } else if (firstAttacker.equals(fighter2.name)) {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                firstAttacker = fighter1.name;
            }
        }

        return (fighter1.health <= 0)? fighter2.name:fighter1.name;
    }

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static void main(String[] args) {
        //System.out.println(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
    }
}
