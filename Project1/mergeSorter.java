import java.util.*;
/**
 * Perform Mergesort on an ArrayList or LinkedList
 *
 * @author EvanVu
 */
public class mergeSorter<E> implements Sorter<E>
{
    public mergeSorter()
    {
    }

    public static <E extends Comparable<E>> void sort (E[] a, int start, int end) {
        if (start >= end) return; 
        int half = (start+end) / 2; 
        sort(a, start, half);  
        sort(a, half+1, end);  
        merge(a, start, half, end); 
    }
    
    private static <E extends Comparable<E>> void merge(E[] a, int start, int half, int end) { 
        E[] b = Arrays.copyOfRange(a, start, half+1); 
        int i = 0;  
        // index in b 
        int j = half+1;  
        // index in second half of a
        int k = start;  
        // index in merged a
        while (i < b.length && j <= end ) if (b[i].compareTo(a[j]) <= 0) a[k++] = b[i++]; 
        else a[k++] = a[j++]; 
        while (i < b.length) a[k++] = b[i++]; 
    }
    
    public <E extends Comparable<E>> void sortArray(E myArray[]){
        this.sort(myArray, 0, myArray.length-1);
    }      
}
