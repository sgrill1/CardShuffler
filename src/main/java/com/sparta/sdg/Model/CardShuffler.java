package com.sparta.sdg.Model;

import java.util.ArrayList;
import java.util.List;

public class CardShuffler {

    private List<Card> pack = new ArrayList<> ();

    public void createCardDeck() {
        for (Suits suit : Suits.values ()) {
            for (CardValues value : CardValues.values ()) {
                pack.add (new Card (value.getValue (), suit.getSymbol ()));
            }
        }
    }


    public List<Card> getPack(){
        return pack;
    }
}