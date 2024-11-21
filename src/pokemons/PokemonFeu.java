package pokemons;

public class PokemonFeu extends Pokemon {
    public PokemonFeu(String nom) {
        super(nom,TypePokemon.FEU);
    }

    @Override
    public void attaquer(Pokemon p) {
        System.out.println(this.getNom() + " attaque " + p.getNom() + " avec une attaque de type Feu.");
        p.subir(this);
    }

    @Override
    public void subir(Pokemon p) {
        double damage = p.getAtk();
        if (p.getType() == TypePokemon.EAU) {
            damage *= 2; // Eau est super efficace contre Feu
        } else if (p.getType() == TypePokemon.PLANTE) {
            damage *= 0.5; // Plante est peu efficace contre Feu
        }
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
        System.out.println(this.getNom() + " subit " + damage + " dégâts et a maintenant " + this.hp + " HP.");
    }
}

