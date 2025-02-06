package org.example;

import org.example.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Lab2 {
    public static void main(String[] args){
        Battle battle = new Battle();
        Azumarill azumarill = new Azumarill("Гандж", 8);
        Azurill azurill = new Azurill("Цезарь", 6);
        Grimer grimer = new Grimer("Грозны", 6);
        Marill marill = new Marill("Евро", 8);
        Minun minun = new Minun("Грим", 11);
        Muk muk = new Muk("Буян", 11);

        battle.addAlly(azumarill);
        battle.addAlly(azurill);
        battle.addAlly(grimer);
        battle.addFoe(marill);
        battle.addFoe(minun);
        battle.addFoe(muk);
        battle.go();
    }
}
