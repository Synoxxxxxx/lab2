package org.example.moves.status;

import ru.ifmo.se.pokemon.*;
public class DoubleTeam extends StatusMove{

    public DoubleTeam() {super(Type.NORMAL, Double.NaN, Double.NaN);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.3).condition(Status.SLEEP).turns(1));}
    @Override
    protected String describe() {
        return ("повышает уклонение пользователья на 1 уровень");
    }

}
