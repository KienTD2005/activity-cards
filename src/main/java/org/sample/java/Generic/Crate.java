package org.sample.java.Generic;

import java.util.ArrayList;
import java.util.List;

public class Crate<S extends Box<?>> /* <?>> is a wildcard */{

    protected List<S> containers;
    public Crate() {
        this.containers = new ArrayList<>();
    }

    // mutator
    public void addBox(S box){
        this.containers.add(box);
    }

    @Override
    public String toString() {
       final StringBuilder sb = new StringBuilder("Crate{");
       sb.append("containers=").append(containers);
       sb.append('}');
       return sb.toString();
    }
}
