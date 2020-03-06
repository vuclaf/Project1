import java.util.*;
/**
 * Write a description of class quickSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class quickSorterRand<E> implements Sorter<E>
{
    public static <E extends Comparable<E>> void swap(E[] array, int a, int b){
        E temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    
    public <E extends Comparable<E>>void sortArray (E[] a) {
        qSort(a, 0, a.length-1);
    }
    
    private static <E extends Comparable<E>>int partition(E[] a, int fst, int lst) {
        Random rand = new Random(System.nanoTime());
        E pivot = a[rand.nextInt(lst-fst)+fst];
        int u = fst;
        int d = lst;
        do {
            while ((u < lst) &&(pivot.compareTo(a[u]) >= 0))u++;
            while (pivot.compareTo(a[d]) < 0)d--;
            if (u < d) swap(a, u, d);
        } 
        while (u < d);
        swap(a, fst, d);
        return d;
    }
    
    private static <E extends Comparable<E>>
    void qSort (E[] a, int fst, int lst) {
        if (fst < lst) {
            int pivIndex = partition(a, fst, lst);
            qSort(a, fst, pivIndex-1);
            qSort(a, pivIndex+1, lst);
        }
    }
}
