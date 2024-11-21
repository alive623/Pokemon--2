package pokemons;

import java.util.Random;

public class Pokemon0 {
    private String nom;
    private int niveau;
    private int hp;
    private int atk;

    public Pokemon0(String nom) {
        this.nom = nom;
        Random rand = new Random();
        this.niveau =rand.nextInt(1,10); // Niveau entre 1 et 10
        this.hp = 2 * niveau;
        this.atk = (niveau / 2) + 1;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public boolean isKO() {
        return hp == 0;
    }


    public void attaquer(Pokemon0 p) {
        p.hp -= this.atk;
        if (p.hp < 0) p.hp = 0;
        log(nom + " attaque " + p.nom + " et inflige " + this.atk + " dégâts.");
    }
    
    public void soigner() {
    	this.hp = 2 * niveau;
    }
    
    public String toString() {
    	return "je m'appelle " + nom + " je suis de niveau " + niveau + " j'ai " + hp + " points de vie " + "mon attaque de base est de" + atk ;
    };

 

    public void log(String msg) {
        System.out.println("[Pokemon " + nom + " ] : " + msg);
    }
}

