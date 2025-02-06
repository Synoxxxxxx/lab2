package org.example.moves.special;

import ru.ifmo.se.pokemon.*;

public class Swift extends SpecialMove {
    public Swift(){super(Type.NORMAL, 60, Double.POSITIVE_INFINITY);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.3).condition(Status.PARALYZE).turns(1));
    }

    @Override
    protected String describe() {
        return ("Наносит урон и игнорирует изменения показателей точности и уклонения.");
    }
}
