package org.example.pokemons;

import org.example.moves.status.DoubleTeam;
import org.example.moves.status.Rest;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Minun extends Pokemon {
    public Minun(String name, int level) {
        super(name, level);
        setType(Type.FAIRY, Type.PSYCHIC);
        setStats(60.0, 40.0, 50.0, 75.0, 85.0, 95.0);
        setMove(new DoubleTeam(), new Rest());
    }
}