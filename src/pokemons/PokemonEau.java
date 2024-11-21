package pokemons;

public class PokemonEau extends Pokemon {
	
	
    public PokemonEau(String nom) {
        super(nom,TypePokemon.EAU);
    }

    @Override
    public void attaquer(Pokemon p) {
        System.out.println(this.getNom() + " attaque " + p.getNom() + " avec une attaque de type Eau.");
        p.subir(this);
    }

    @Override
    public void subir(Pokemon p) {
        double damage = p.getAtk();
        if (p.getType() == TypePokemon.PLANTE) {
            damage *= 2; // Plante est super efficace contre Eau
        } else if (p.getType() == TypePokemon.FEU) {
            damage *= 0.5; // Feu est peu efficace contre Eau
        }
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
        System.out.println(this.getNom()+ " subit " + damage + " dégâts et a maintenant " + this.hp + " HP.");
    }
}


