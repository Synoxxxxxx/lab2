package org.example.pokemons;

import org.example.moves.physical.PlayRough;
import org.example.moves.status.BellyDrum;
import org.example.moves.status.DoubleTeam;
import org.example.moves.status.Rest;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Azumarill extends Pokemon{
    public Azumarill(String name, int level) {
        super(name, level);
        setType(new Type[]{Type.WATER, Type.FAIRY, Type.PSYCHIC});
        setStats(100.0, 50.0, 80.0, 60.0, 80.0, 50.0);
        setMove(new DoubleTeam(), new Rest(), new BellyDrum(), new PlayRough());
    }
}
