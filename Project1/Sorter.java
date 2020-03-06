import java.util.*;
/**
 * Common sorter interface to be implemented by 
 * specific sorter classes
 * @author Evan Vu
 */
public interface Sorter<E>
{
    /**
     * Method sort that all sorters will have
     */
    public abstract <E extends Comparable<E>> void sortArray(E myArray[]);
    
}
