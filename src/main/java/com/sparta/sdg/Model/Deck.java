package com.sparta.sdg.Model;

import java.util.List;

public class Deck {
    private List<Card> pack;

    public Deck(List<Card> pack){
        this.pack = pack;
    }

    public List<Card> getPack(){
        return pack;
    }
}
