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
        PrintWriter writer =null;
        try{
            writer = new PrintWriter(new File("output.txt"));
            for(int i=1000;i<5000;i+=100){
                Integer[] newArray = new Integer[i];
                System.arraycopy(exp.randArrayCreator(i), 0, newArray, 0, i);
                writer.println(exp.timeExecuted(newArray));
            }
            writer.close();
        }
        catch(Exception e){
            System.out.println("Exception ocurred: " + e);
        }        
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
    
    public Integer[] randArrayCreator(int size){
        Random rand = new Random(System.nanoTime());
        Integer[] created = new Integer[size];
        for (int i=0; i<size; i++){
            created[i]=(Integer)rand.nextInt();
        }
        return created;
    }
    
    public long timeExecuted(Integer[] testInput){
        quickSorterRand<Integer> qsr = new quickSorterRand<Integer>();
        long startTime = System.currentTimeMillis();
        qsr.sortArray(testInput);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    
}