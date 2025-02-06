package org.example.moves.status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, Double.NaN, Double.NaN);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.7).condition(Status.SLEEP).turns(2));
    }

    @Override
    protected String describe() {
        return ("пользователь пропускает 2 хода, но восстанавливает полный запас здоровья");
    }
}