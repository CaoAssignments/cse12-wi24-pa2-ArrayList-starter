/**
 * This file contains all of the methods for the MyList interface. All classes
 * implementing this interface should also implement the methods listed here.
 */

/**
 * An interface that specifies the functionality of an ArrayList ADT
 */
public interface MyList<E> {
    /**
     * Increase the capacity of underlying array if needed
     *
     * @param requiredCapacity minimum capacity after expanding
     */
    void expandCapacity(int requiredCapacity);

    /**
     * Get the amount of elements array can hold
     *
     * @return number of elements that can be held
     */
    int getCapacity();

    /**
     * Add an element at the specified index
     *
     * @param index   position to insert the element
     * @param element the element to insert
     */
    void insert(int index, E element);

    /**
     * Add an element to the end of the list
     *
     * @param element the element to append
     */
    void append(E element);

    /**
     * Add an element to the beginning of the list 
     *
     * @param element the element to prepend
     */
    void prepend(E element);

    /**
     * Get the element at the given index
     *
     * @param index the index at which to return the element
     * @return the element at the index
     */
    E get(int index);

    /**
     * Replaces an element at the specified index with a new element and return
     * the original element
     *
     * @param index   the index at which to replace
     * @param element the element with which to replace
     * @return the original element
     */
    E set(int index, E element);

    /**
     * Remove the element at the specified index and return the removed element
     *
     * @param index the index at which to remove the element
     * @return the removed element
     */
    E remove(int index);

    /**
     * Get the number of elements in the list
     *
     * @return number of elements in the list
     */
    int size();

    /**
     * Rotate the list by index number of positions to the left
     * 
     * @param index the number of positions to rotate by
     */
    void rotate(int index);

    /**
     * Find the element in the list and return its index
     * 
     * @param element the element to find
     * @return the index of the first occurrence of element (-1 if not found)
     */
    int find(E element);
}
