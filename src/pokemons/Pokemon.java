package pokemons;
import java.util.Random;


public abstract class Pokemon {
    private String nom;
    private int niveau;
    protected int hp;
    private int atk;
    private TypePokemon type;

    public Pokemon(String nom) {
        this.nom = nom;
        Random rand = new Random();
        this.niveau = 1 + rand.nextInt(10); // Niveau entre 1 et 10
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
    public TypePokemon getType() {
        return type;
    }
        
    public boolean isKO() {
        return hp == 0;
    }

    public void soigner() {
        this.hp = 2 * niveau;
    }

    public abstract void attaquer(Pokemon p);

    public abstract void subir(Pokemon p);

    @Override
    public String toString() {
    	return "je m'appelle " + nom + "!\n"
    			+" je suis de niveau " + niveau + "\n"
    			+" j'ai " + hp + " points de vie \n" 
    			+ "mon attaque de base est de" + atk ;
    }
    
}

