package org.example.moves.special;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.1).condition(Status.PARALYZE).turns(1));
    }


    @Override
    protected String describe() {
        return "выпускает электрический заряд в противника, который может порализовать его";
    }
}

