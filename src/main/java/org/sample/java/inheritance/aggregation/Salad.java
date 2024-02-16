package org.sample.java.inheritance.aggregation;

public class Salad {
    private final String lettuce;
    private final String tomato;
    private final String peppers;
    private final String croutons;

    public Salad() {
        this.tomato = "tomato";
        this.lettuce = "lettuce";
        this.peppers = "tons";
        this.croutons = "a few";
    }

    public Salad(String tomato, String lettuce, String peppers, String croutons) {
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.peppers = peppers;
        this.croutons = croutons;
    }
}
