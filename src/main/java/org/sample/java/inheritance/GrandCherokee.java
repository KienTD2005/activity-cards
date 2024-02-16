package org.sample.java.inheritance;

public class GrandCherokee extends Jeep{
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GrandCherokee(");
        sb.append("gasMileage");
        return sb.toString();
    }
}
