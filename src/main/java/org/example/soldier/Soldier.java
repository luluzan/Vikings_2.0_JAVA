package org.example.soldier;

    public class Soldier {
        public int health;
        public int strength;

        public Soldier(int health, int strength) {
            this.health = health;
            this.strength = strength;
        }
//COMO ES PUBLICO NO NECESITAMOS LOS GETTERS NOR SETTERS
//        public int getHealth() {
//            return health;
//        }
//
//        public int getStrength() {
//            return strength;
//        }
//
//        public void setHealth(int health) {
//            this.health = health;
//        }
//
//        public void setStrength(int strength) {
//            this.strength = strength;
//        }
        public int attack() { // Aplicamos daño y devolvemos la fuerza de soldier
            return this.strength;
        }

        public void receiveDamage(int damage) {
            health -= damage;
        }
    }
