package org.example.pokemons;

import org.example.moves.special.MudSlap;
import org.example.moves.special.Sludge;
import org.example.moves.special.Venoshock;
import org.example.moves.status.VenomDrench;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Muk extends Pokemon {
    public Muk(String name, int level) {
        super(name, level);
        setType(new Type[]{Type.NONE, Type.PSYCHIC});
        setStats(105.0, 105.0, 75.0, 65.0, 100.0, 50.0);
        setMove(new MudSlap(), new Venoshock(), new VenomDrench(), new Sludge());




}
}