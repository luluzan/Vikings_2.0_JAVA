package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    public String name;

    public Vikings(int strength, int health, String name) {
        super(strength,health);
        this.name = name;
    }
    public void receiveDamage(int damage) {
        super.health -= damage;
    }

    public String getMsg() {
        if (super.health <= 0) {
            return name + " it's fucking dead";
        } else {
            return name + " has received " + super.health + " points of damage";
        }
    }

    public String battleCry() {
        return "Odin Owns You All!";
    }

    public int getStrength() { //ppara el test de war
        return strength;
    }

    public int getHealth() {
        return health;
    }

}

