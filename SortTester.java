package mp6;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class SortTester {

  Integer[] sorted = {1, 2, 3, 4, 5};
  Integer[] testArray = {5, 3, 2, 1, 4};
  Integer[] emptyArray = {};
  Integer[] singleton = {1};
  Integer[] alreadySorted = {1, 2, 3, 4, 5};
  Integer[] halfSorted = {1, 2, 3, 5, 4, 6};
  Integer[] repetitiveArray = {1, 1, 1, 1, 1};
  Integer[] negativeArray = {-2, -3, -5, -1, -4};
  Integer[] zeroArray = {1, 0, 2};

  InsertionSort InsertionSorter = new InsertionSort();
  MergeSort MergeSorter = new MergeSort();
  QuickSort QuickSorter = new QuickSort();
  FreitasLiviaSort FreitasLiviaSorter = new FreitasLiviaSort();

  BasicComparator<Integer> newComparator = new BasicComparator<Integer>();

  @Test
  public void unsortedTest(){
    InsertionSorter.sort(testArray, newComparator);
    assertTrue(Arrays.equals(testArray, sorted));
  }
  /**
  * Checks if the empty list is handled gracefully
  */
  @Test
  public void emptyListTest(){
    assertTrue(true);
  }

  /**
  * Checks if the singleton list is handled gracefully
  */
  @Test
  public void singletonTest(){

  }

  /**
  * Checks if the sort works for an already sorted list
  */
  @Test
  public void alredySortedTest(){

  }

  /**
  * Checks if a half-sorted list is sorted properly
  */
  @Test
  public void halfSortedTest(){

  }

  /**
  * Checks if a list made of one repeated element is sorted properly
  */
  @Test
  public void repeatedElementTest(){

  } 

  /**
  * Checks if negative numbers are sorted properly
  */
  @Test
  public void negativeNumbersTest(){

  }

  /**
   * Checks if zero is handled properly
   */
  @Test
  public void zeroTest(){
    
  }

  public void main(String args[]) throws Exception{

  }
}