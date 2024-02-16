package org.sample.java.inheritance.aggregation;

public class Driver2 {
    public static void main(String[] args){
        Salad salad = new Salad("a lot", "not much", "onion","garlic");
        System.out.println(salad); //

        Salad salad2 = new Salad();
        System.out.println(salad2); // composition

    }
}
