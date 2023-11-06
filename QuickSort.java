package mp6;
import java.util.Comparator;

/**
 * Author: Livia Stein Freitas.
 * Implements insertion sort, which partitions the array and then recurses over the two halves to sort it.
 */
public class QuickSort implements Sorter {
 /* CODE IS NOT WORKING AT THE MOMENT  

  public <T> int partition(T[] values, int lo, int hi, Comparator<? super T> order){

    //pick leftmost element for the pivot
    T pivot = values[lo];

    int i = lo;

    //traverse the entire array and compare each element to the pivot
    for (int j = lo; j < hi;){
      if (order.compare(pivot, values[j]) > 0){
        i++;
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
      }
    }
    T temp = values[i+1];
    values[i+1] = values[hi];
    values[hi] = temp;
    
    return i + 1;
  }

  /**
   * Takes in an array and a comparator. Sorts the array. Returns nothing.
   
  public <T> void sortHelper(T[] values, int lo, int hi, Comparator<? super T> order){
    if (lo < hi){
      int helperPivot = partition(values, lo, hi, order);
      sortHelper(values, lo, helperPivot - 1, order);
      sortHelper(values, helperPivot + 1, hi, order);
    }
  }
  public <T> void sort(T[] values, Comparator<? super T> order){
    sortHelper(values, 0, values.length - 1, order);
  }

  public static void main(String[] args) {
    Integer[] testArray = {2, 3, 1, 4, 5};
    QuickSort QuickSorter = new QuickSort();
    BasicComparator<Integer> newComparator = new BasicComparator<Integer>();
    QuickSorter.sort(testArray, newComparator);
  }
  */
}

