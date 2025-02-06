package org.example.pokemons;

import org.example.moves.special.Swift;
import org.example.moves.special.Thunder;
import org.example.moves.special.Thunderbolt;
import org.example.moves.status.Confide;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Azurill extends Pokemon {
    public Azurill(String name, int level) {
        super(name, level);
        setType(Type.DRAGON, Type.PSYCHIC);
        setStats(50.0, 20.0, 40.0, 20.0, 40.0, 20.0);
        setMove(new Confide(), new Thunder(), new Swift(), new Thunderbolt());
    }
}