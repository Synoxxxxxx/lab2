package org.example.moves.special;

import ru.ifmo.se.pokemon.*;

public class Sludge  extends SpecialMove{
    public Sludge(){
        super(Type.POISON, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){p.addEffect(new Effect().chance(0.3).condition(Status.POISON));}

    @Override
    protected String describe() {
        return ("отнимает уровень врага особенным ударом");
    }
}


