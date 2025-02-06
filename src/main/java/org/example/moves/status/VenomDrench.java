package org.example.moves.status;

import ru.ifmo.se.pokemon.*;

public class VenomDrench extends StatusMove{
    public VenomDrench(){
        super(Type.POISON, Double.NaN, Double.NaN);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.4).condition(Status.POISON).turns(2));}

    @Override
    protected String describe() {
        return ("Если цель отравлена, Venom Drench снижает ее атаку, специальную атаку и скорость на одну ступень");
    }

}
