package org.sample.java.inheritance;

import java.util.List;
import java.util.ArrayList;
public class Driver {
    public static void main(String[] args){
        LandCraft grandCherokee = new GrandCherokee();
        LandCraft wrangler = new Wrangler();

        System.out.println(grandCherokee);
        System.out.println(wrangler);

        List<LandCraft> landcrafts = new ArrayList<>();
        landcrafts.add(wrangler);
        landcrafts.add(grandCherokee);

        for (LandCraft lc : landcrafts){
            System.out.println(lc.getClass().getSimpleName());
        }

        landcrafts.forEach(System.out::println); // Polymorphism

    }
}
