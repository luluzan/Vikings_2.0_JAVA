package org.example.saxon;


import org.example.soldier.Soldier;
import org.example.vikins.Vikings;

public class Saxon extends Soldier {
    public Saxon(int strength, int health) {
        super(strength, health);
    }
    public int attack() {
        return super.strength;
    }
    public String getMsg() {
        if (super.health <= 0) {
            return "A Saxon has died in combat";
        } else {
            return "A Saxon has received " + super.health + " points of damage";
        }
    }
    public int getHealth() {//ppara que nos devielva health en war test
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void receiveDamage(int damage) {
        health -= damage;
    }

    public int getStrength() {
        return strength;
    }
}
