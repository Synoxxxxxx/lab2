package org.example.moves.special;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove{
    public Venoshock() {
        super(Type.POISON, 65, 100);
    }

    @Override
    protected String describe() {
        return ("Наносит двойной урон по цели, если ранее она была отравлена");
    }
}
