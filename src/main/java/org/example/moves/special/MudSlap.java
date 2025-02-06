package org.example.moves.special;

import ru.ifmo.se.pokemon.*;

public class MudSlap extends SpecialMove{
    public MudSlap()  {
        super(Type.GROUND, 20, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(1).stat(Stat.ATTACK, -1).turns(-1));
    }

    @Override
    protected String describe() {
        return ("грубо играет с целью, а затем атакует");
    }
}

