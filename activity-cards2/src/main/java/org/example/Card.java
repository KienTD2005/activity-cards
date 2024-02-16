package org.example;

public class Card implements Comparable<Card>{

    private Suit suit;
    private FaceValue faceValue;

    private Card() {
    }

    public Card(Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
