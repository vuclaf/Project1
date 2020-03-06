import java.util.*;
/**
 * Write a description of class insertionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class insertionSort <E> implements Sorter <E>
{

    /**
     * Constructor for objects of class insertionSort
     */
    public insertionSort()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public <E extends Comparable<E>>
    void sortArray (E[] a) { 
        for (int nextPos = 1; nextPos < a.length; nextPos++){
            insert(a, nextPos);
        }
    }

    private  <E extends Comparable<E>> 
    void insert (E[] a, int nextPos) {
        E nextVal = a[nextPos]; 
        while (nextPos > 0 && nextVal.compareTo(a[nextPos-1]) < 0){
            a[nextPos] = a[nextPos-1]; 
            nextPos--;
        } 
        a[nextPos] = nextVal; 
    }

}

