package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilsTest {

    @Test
    void quicksort() {
        ArrayList<String> actual = new ArrayList<>(Arrays.asList("we", "use", "both", "first", "and", "third", "party", "cookies", "to", "personalise",
                "web", "content", "analyse", "visits", "to", "our", "websites", "and", "tailor", "advertisements"));


        ArrayList<String> expected =
                new ArrayList<>(Arrays.asList("advertisements", "analyse", "and", "and", "both", "content", "cookies", "first", "our", "party", "personalise", "tailor", "third", "to", "to", "use", "visits", "we", "web", "websites"));

        MyUtils<String> myUtils = new MyUtils<>();
        myUtils.quicksort(actual, 0, actual.size()-1);
        assertEquals(actual, expected);
    }
}