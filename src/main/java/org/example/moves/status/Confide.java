package org.example.moves.status;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
    public Confide() {super(Type.NORMAL, Double.NaN, Double.NaN);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.3).condition(Status.NORMAL).turns(1));}


    @Override
    protected String describe() {
        return ("атака становится максимальной, но её обладатель тряет 50% своего здоровья");
    }

}
