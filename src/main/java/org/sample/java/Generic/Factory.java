package org.sample.java.Generic;

public class Factory {
    public static <T> T getInstance(Class<T> clazz) throws Exception{
    //                              parameterized
        return clazz.getConstructor().newInstance();
    }

    public static void main(String[] args)
        {
            try {
                Box<Integer> box = Factory.getInstance(Box.class);
                String message = Factory.getInstance(String.class);
                box.setContents(1);
                message = "Hello";
                System.out.println(box);
                System.out.println(message);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
}
