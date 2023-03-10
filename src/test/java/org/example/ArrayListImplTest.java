package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListImplTest {

    @Test
    void add_correctAddedElementToList() {
        List<String> arrayListImpl = new ArrayListImpl<String>();
        String actual = "1000";
        arrayListImpl.add(actual);

        String expected = arrayListImpl.get(0);

        assertEquals(actual, expected);
    }

    @Test
    void add_correctAddingElementToListByIndex() {
        List<String> arrayListImpl = new ArrayListImpl<String>();
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
        List<String> arrayListImpl = new ArrayListImpl<String>();
        String actual = "2222";

        assertThrows(IndexOutOfBoundsException.class, () -> {arrayListImpl.add(0, actual);});
    }

    @Test
    void get_correctGettingElementFromListByIndex() {
        List<String> arrayListImpl = new ArrayListImpl<String>();
        String actual = "0";
        arrayListImpl.add(actual);

        String expected = arrayListImpl.get(0);

        assertEquals(actual, expected);
    }

    @Test
    void remove_correctRemovingElementFromListByIndex() {
        List<String> arrayListImpl = new ArrayListImpl<String>();
        String actual = "0";
        arrayListImpl.add(actual);
        String expected = arrayListImpl.remove(0);

        assertEquals(actual, expected);
    }

    @Test
    void add_throwExceptionIfRemoveElementByIncorrectIndex() {
        List<String> arrayListImpl = new ArrayListImpl<String>();

        assertThrows(IndexOutOfBoundsException.class, () -> {arrayListImpl.remove(0);});
    }

    @Test
    void clear_correctClearList() {
        List<String> arrayListImpl = new ArrayListImpl<String>();
        for (int i = 0; i <= 10; i++) {
            arrayListImpl.add("" + i);
        }
        arrayListImpl.clear();
        assertEquals(0, arrayListImpl.size());
    }

    @Test
    void size_gettingSizeOfList() {
        List<String> arrayListImpl = new ArrayListImpl<String>();
        for (int i = 0; i <= 10; i++) {
            arrayListImpl.add("" + i);
        }
        assertEquals(11, arrayListImpl.size());
    }
}
