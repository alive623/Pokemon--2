package pokemons;

public enum TypePokemon {
    FEU("Feu"),
    EAU("Eau"),
    PLANTE("Plante");

    private final String nomType;

    TypePokemon(String nomType) {
        this.nomType = nomType;
    }

    @Override
    public String toString() {
        return nomType;
    }
}