package org.example.war;

import org.example.saxon.Saxon;
import org.example.vikins.Vikings;

import java.util.ArrayList;
import java.util.List;//usar list
import java.util.Random;//implementamos random

public class War extends Vikings {
    private List<Vikings> vikingArmy;
    private List<Saxon> saxonArmy;

    public War(int health, int strength, String name) {
        super(health, strength, name);
        this.vikingArmy = new ArrayList<>();
        this.saxonArmy = new ArrayList<>();
    }

    public List<Vikings> getVikingArmy() {
        return vikingArmy;
    }

    public List<Saxon> getSaxonArmy() {
        return saxonArmy;
    }

    public void addViking(Vikings viking) {
        vikingArmy.add(viking);
    }

    public void addSaxon(Saxon saxon) {
        saxonArmy.add(saxon);
    }

    private Vikings getRandomViking() {
        int randomIndex = new Random().nextInt(vikingArmy.size());
        return vikingArmy.get(randomIndex);
    }

    private Saxon getRandomSaxon() {
        int randomIndex = new Random().nextInt(saxonArmy.size());
        return saxonArmy.get(randomIndex);
    }

    public String vikingAttack() {
        if (saxonArmy.isEmpty()) {
            System.out.println("No hay sajones en el ejército sajón.");
            return null;
        }

        Vikings randomViking = getRandomViking();
        Saxon randomSaxon = getRandomSaxon();

        int vikingStrength = randomViking.getStrength();
        randomSaxon.receiveDamage(vikingStrength);

        if (randomSaxon.getHealth() <= 0) {
            saxonArmy.remove(randomSaxon);
            return "A Saxon has died in combat";
        }

        return "La que esta liando el pollitoVikingo";
    }

    public String saxonAttack() {
        if (vikingArmy.isEmpty()) {
            System.out.println("No hay vikingos en el ejército vikingo.");
            return null;
        }

        Saxon randomSaxon = getRandomSaxon();
        Vikings randomViking = getRandomViking();

        int saxonStrength = randomSaxon.getStrength();
        randomViking.receiveDamage(saxonStrength);

        if (randomViking.getHealth() <= 0) {
            vikingArmy.remove(randomViking);
            return "A Viking has died in act of combat";
        }

        return randomViking.getMsg();
    }
}
//finalizado_commit + push