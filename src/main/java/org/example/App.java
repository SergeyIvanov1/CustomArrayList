package org.example;

import java.util.Collections;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ArrayListImpl<String> list = new ArrayListImpl<String>();

        for (int i = 0; i <= 10; i++) {
            list.add("" + i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); //0 1 2 3 4 5 6 7 8 9 10
        }


        System.out.println(list.get(4)); //4

        System.out.println(list.remove(3)); //3

        list.clear();
        System.out.println(list.size()); //0
    }
}

