import java.util.*;
import java.io.*;

/**
 * A class to run tests on sorting methods
 * @Author EvanVu
 */
public class ExperimentController{
    
    public ExperimentController(){};
    
    public static void main(String[] args) throws Exception{
        ExperimentController exp = new ExperimentController();
        Integer[] input = new Integer[1000];
        exp.dataIn(input);
        exp.dataOut(input);
    }
    
    public void dataIn(Integer[] testInput) throws Exception{
        File F = new File("1k.txt");
        Scanner scr = new Scanner(F);
        int i=0;
        while (scr.hasNextLine()){
            testInput[i]=Integer.parseInt(scr.nextLine());
            i++;
        }
    }
    
    public void dataOut(Integer[] testInput){
        selectionSort<Integer> ss = new selectionSort<Integer>();
        bubbleSort<Integer> bb = new bubbleSort<Integer>();
        insertionSort<Integer> is = new insertionSort<Integer>();
        mergeSorter<Integer> ms = new mergeSorter<Integer>();
        quickSorterFirst<Integer> qsf = new quickSorterFirst<Integer>();
        quickSorterRand<Integer> qsr = new quickSorterRand<Integer>();
        quickSorterMed<Integer> qsm = new quickSorterMed<Integer>();
        qsr.sortArray(testInput);
        PrintWriter writer =null;
        try{
            writer = new PrintWriter(new File("output" +System.nanoTime() +".txt"));
            for(int element:testInput){
                writer.println(element);
            }
            writer.close();
        }
        catch(Exception e){
            System.out.println("Exception ocurred: " + e);
        }
    }
}