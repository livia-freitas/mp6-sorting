package mp6;
import java.util.Comparator;

/**
 * Author: Livia Stein Freitas.
 * Implements insertion sort, which builds the final sorted list one element at a time.
 */
public class InsertionSort implements Sorter {
  
  public Comparator<Integer> compareInts = (x,y) -> x.compareTo(y); 

  /**
   * Takes in an array and a comparator. Sorts the array. Returns nothing.
   */
  public <T> void sort(T[] values, Comparator<? super T> order){
    
    int size = values.length;
    if(size > 1){
      for (int i = 1; i < size; i++){
        T current = values[i];
        int j = i - 1;
        while (j >= 0 && (order.compare(current, values[j]) > 0)){
          values[j+1] = values[j]; 
          j --;
          values[j+1] = current;  
        }
      }
    }
  }

  public static void main(String[] args) {
    Integer[] testArray = {1};
    InsertionSort InsertionSorter = new InsertionSort();
    BasicComparator<Integer> newComparator = new BasicComparator<Integer>();
    InsertionSorter.sort(testArray, newComparator);
    System.out.println(testArray[0]);
    /* 
    for (int i = 0; i < 5; i++){
      System.out.println(testArray[i]);
    }
    */
  }
}
