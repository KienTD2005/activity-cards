package org.sample.java.Algorithm;

import java.util.HashMap;
import java.util.Map;
public class FibonacciNumbers {
    private Map<Integer, Long> dictionary;




    public FibonacciNumbers() {
        this.dictionary = new HashMap<>();
    }


    public long fib(int n){
        if (n == 0)
        {
            return 0;
        }

        if (n == 1)
        {
            return 1;
        }

        return memo(n - 1) + memo(n - 2);
    }

    private long memo(int e){

        Long value = dictionary.get(e);
            if (value != null)
            {
                return value;
            }

            value = fib(e);
            dictionary.put(Integer.valueOf(e), value);
            return value;
    }

}
