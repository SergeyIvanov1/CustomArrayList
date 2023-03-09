package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * It is custom implementation some methods of ArrayList
 *
 * @author Ivanov Sergey
 */
public class ArrayListImpl<E> extends ArrayList<E> {
    /*
     * Size of array (the number of elements it contains).
     */
    private int size;
    /*
     * Capacity of array  (the number of cells which array contains).
     */
    private int capacity;
    /*
    * Default initial capacity of array.
     */
    private final int INITIAL_CAPACITY = 10;
    /*
     * Array of elements.
     */
    private Object[] elements;

    /*
     * Constructor without parameters, which contains initialization of array.
     */
    public ArrayListImpl() {
        capacity = INITIAL_CAPACITY;
        size = 0;
        elements = new Object[capacity];
    }

    /**
     * Method adding element to end of collection
     *
     * @param element value for adding
     * @throws IndexOutOfBoundsException if index out of bounds
     */
    @Override
    public boolean add(E element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
        return true;
    }

    /**
     * Method adding element to collection by specify index
     *
     * @param index of list
     * @param value value for adding
     * @throws IndexOutOfBoundsException if index out of bounds
     */
    @Override
    public void add(int index, E value) {
        checkIndex(index);
        if (size == capacity) {
            grow();
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = value;
        size++;
    }


    /**
     * Returning element of list by index
     *
     * @param index of list
     * @return element of collection
     * @throws IndexOutOfBoundsException if index out of bounds
     */
    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    /**
     * Removing element of list by index.
     *
     * @param index of list
     * @return removed element of collection
     * @throws IndexOutOfBoundsException if index out of bounds
     */
    @Override
    public E remove(int index) {
        checkIndex(index);
        E result = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, (size - 1 - index));
        elements[size-1] = null;
        size--;
        return result;
    }

    /**
     * Method assigned null to all elements in array.
     *
     */
    @Override
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }

    /**
     * Returning size of list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Method increment capacity of array and copy all elements
     * to new array, which assigned to ашудв 'elements'.
     *
     * @throws NegativeArraySizeException – if newLength is negative,
     * @throws NullPointerException – if original is null
     */
    private void grow() {
        this.capacity += capacity / 2;
        this.elements = Arrays.copyOf(elements, capacity);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
