package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListImplTest {

    @Test
    void add_correctAddedElementToList() {
        ArrayListImpl<String> arrayListImpl = new ArrayListImpl<String>();
        String actual = "1000";
        arrayListImpl.add(actual);

        String expected = arrayListImpl.get(0);

        assertEquals(actual, expected);
    }
    @Test
    void add_correctAddingThousandElementToListByIndex() {
    ArrayListImpl<Object> arrayListImpl = new ArrayListImpl<>();
        for (int i = 0; i < 1000; i++) {
            arrayListImpl.add(0, new Object());
        }
            int actual = 1000;

            int expected = arrayListImpl.size();

            assertEquals(actual, expected);
    }

    @Test
    void add_correctAddingElementToListByIndex() {
        ArrayListImpl<String> arrayListImpl = new ArrayListImpl<String>();
        for (int i = 0; i <= 10; i++) {
            arrayListImpl.add("" + i);
        }
        String actual = "2222";
        arrayListImpl.add(0, actual);

        String expected = arrayListImpl.get(0);

        assertEquals(actual, expected);
    }

    @Test
    void add_throwExceptionIfAddIncorrectIndex() {
        ArrayListImpl<String> arrayListImpl = new ArrayListImpl<String>();
        String actual = "2222";

        assertThrows(IndexOutOfBoundsException.class, () -> {arrayListImpl.add(255, actual);});
    }

    @Test
    void get_correctGettingElementFromListByIndex() {
        ArrayListImpl<String> arrayListImpl = new ArrayListImpl<String>();
        String actual = "0";
        arrayListImpl.add(actual);

        String expected = arrayListImpl.get(0);

        assertEquals(actual, expected);
    }

    @Test
    void remove_correctRemovingElementFromListByIndex() {
        ArrayListImpl<String> arrayListImpl = new ArrayListImpl<String>();
        String actual = "0";
        arrayListImpl.add(actual);
        String expected = arrayListImpl.remove(0);

        assertEquals(actual, expected);
    }

    @Test
    void add_throwExceptionIfRemoveElementByIncorrectIndex() {
        ArrayListImpl<String> arrayListImpl = new ArrayListImpl<String>();

        assertThrows(IndexOutOfBoundsException.class, () -> {arrayListImpl.remove(0);});
    }

    @Test
    void clear_correctClearList() {
        ArrayListImpl<String> arrayListImpl = new ArrayListImpl<String>();
        for (int i = 0; i <= 10; i++) {
            arrayListImpl.add("" + i);
        }
        arrayListImpl.clear();
        assertEquals(0, arrayListImpl.size());
    }

    @Test
    void size_gettingSizeOfList() {
        ArrayListImpl<String> arrayListImpl = new ArrayListImpl<String>();
        for (int i = 0; i <= 10; i++) {
            arrayListImpl.add("" + i);
        }
        assertEquals(11, arrayListImpl.size());
    }
}
