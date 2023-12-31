package mp6;
import java.util.Comparator;

/** Author: Livia Stein Freitas.
 * Implements select sort. It swaps elements until the list is sorted.
 */
public class FreitasLiviaSort implements Sorter {
  
  /**
   * Takes in an array and a comparator. Sorts the array. Returns nothing.
   */
  public <T> void sort(T[] values, Comparator<? super T> order){
    for(int i = 0; i < values.length; i++){
      for (int j = 0; j < values.length; j++){
        if(order.compare(values[i], values[j]) == 1){
          T temp = values[i];
          values[i] = values[j];
          values[j] = temp;
        }
      }
    }
  }
}

