package org.example;

public interface Deck {

    void cut(int index);

    Card deal();

    void newOrder(Deck cards);

    int search(Card cards);

    void shuffle();

    Card turnOver();
}
