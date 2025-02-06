package org.example.pokemons;

import org.example.moves.status.BellyDrum;
import org.example.moves.status.DoubleTeam;
import org.example.moves.status.Rest;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Marill extends Pokemon {
    public Marill(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.FAIRY, Type.PSYCHIC);
        setStats(70.0, 20.0, 50.0, 20.0, 50.0, 40.0);
        setMove(new DoubleTeam(), new Rest(), new BellyDrum());
    }
}



