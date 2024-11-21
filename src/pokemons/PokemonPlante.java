package pokemons;

public class PokemonPlante extends Pokemon {
    public PokemonPlante(String nom) {
        super(nom,TypePokemon.PLANTE);
    }

    @Override
    public void attaquer(Pokemon p) {
        System.out.println(this.getNom() + " attaque " + p.getNom() + " avec une attaque de type Plante.");
        p.subir(this);
    }

    @Override
    public void subir(Pokemon p) {
        double damage = p.getAtk();
        if (p.getType() == TypePokemon.FEU) {
            damage *= 2; // Feu est super efficace contre Plante
        } else if (p.getType() == TypePokemon.EAU) {
            damage *= 0.5; // Eau est peu efficace contre Plante
        }
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
        System.out.println(this.getNom() + " subit " + damage + " dégâts et a maintenant " + this.hp + " HP.");
    }
}

