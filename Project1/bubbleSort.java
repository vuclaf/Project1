import java.util.*;
/**
 * Write a description of class bubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bubbleSort <E> implements Sorter <E>
{

    /**
     * Constructor for objects of class bubbleSort
     */
    public bubbleSort()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public <E extends Comparable<E>> void sortArray(E [] a)
    {
        int pass = 1;
        boolean exchanges;
        do {
            exchanges = false;
            for (int i = 0; i < a.length-pass; i++)
                if(a[i].compareTo (a[i+1]) > 0) {
                    E tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                    exchanges = true;
                } 
            pass++; 
        } while (exchanges);

    }
}
