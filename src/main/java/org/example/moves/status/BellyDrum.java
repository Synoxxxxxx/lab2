package org.example.moves.status;

import ru.ifmo.se.pokemon.*;
public class BellyDrum extends StatusMove{

    public BellyDrum() {
        super(Type.NORMAL, Double.NaN, Double.NaN);
    }


    @Override
    protected String describe() {
        return ("атака становится максимальной, но её обладатель тряет 50% своего здоровья");
    }
}


