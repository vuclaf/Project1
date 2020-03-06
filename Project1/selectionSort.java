import java.util.*;
/**
 * Write a description of class selectionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class selectionSort <E> implements Sorter <E>
{
    /**
     * Constructor for objects of class selectionSort
     */
    public selectionSort()
    {

    }

    public <E extends Comparable<E>>
    void sortArray (E [] a) {
        int n = a.length;
        for (int fill = 0; fill < n-1; fill++) { 
            int posMin = fill; 
            for (int nxt = fill+1; nxt < n; nxt++) 
                if (a[nxt].compareTo(a[posMin])<0) 
                    posMin = nxt;
            E tmp = a[fill];
            a[fill] = a[posMin];
            a[posMin] = tmp; 
        }

    }
}
