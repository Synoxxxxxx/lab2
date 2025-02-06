package org.example.pokemons;

import org.example.moves.special.MudSlap;
import org.example.moves.special.Sludge;
import org.example.moves.special.Venoshock;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Grimer extends Pokemon {
    public Grimer(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.PSYCHIC);
        setStats(80.0, 80.0, 50.0, 40.0, 50.0, 25.0);
        setMove(new MudSlap(), new Venoshock(), new Sludge());
    }
}




