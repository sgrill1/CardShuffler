package com.sparta.sdg.Model;


public enum Suits{
        Hearts{
            public String getSymbol(){
                return "Hearts";
            }
        },
        Diamonds{
            public String getSymbol(){
                return "Diamonds";
            }
        },
        Clubs{
            public String getSymbol(){
            return "Clubs";
            }
        },
        Spades{
            public String getSymbol(){
                return "Spades";
            }
        };

        public abstract String getSymbol();
}

