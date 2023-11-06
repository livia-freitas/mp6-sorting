package mp6;
import java.util.Comparator;
import java.util.Arrays;

/**
 * Author: Livia Stein Freitas.
 * Implements merge sort.
 */
public class MergeSort implements Sorter {
  
  public <T> void sort(T[] values, Comparator<? super T> order){
    if(values.length > 1){
      int mid = values.length/2;
      T[] lowerHalf = Arrays.copyOfRange(values, 0, mid);
      T[] upperHalf = Arrays.copyOfRange(values, mid, values.length);
      

      this.sort(upperHalf, order);
      this.sort(lowerHalf, order);

      int i = 0;
      int j = 0;
      int k = 0;

      while ((i < lowerHalf.length) && (j < upperHalf.length)){
        if (order.compare(lowerHalf[i], upperHalf[j]) == 1){
          values[k] = lowerHalf[i];
          i++;
        } else {
          values[k] = upperHalf[j];
          j++;
        }
        k++;
      }
      
      while (i < lowerHalf.length){
        values[k] = lowerHalf[i];
        i++;
        k++;
      }

      while (j < upperHalf.length){
        values[k] = upperHalf[j];
        j++;
        k++;
      }

    }
  }

}

