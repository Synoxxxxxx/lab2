package org.example.moves.special;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.3).condition(Status.PARALYZE).turns(1));
    }

    @Override
    protected String describe() {
        return ("Наносит урон громом, который может порализовать соперника");
    }
}
