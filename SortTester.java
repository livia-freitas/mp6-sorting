package mp6;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

/**
 * Author: Livia Stein Freitas.
 * Implements tests for my sorting algorithms.
 */
public class SortTester {

  Integer[] sorted = {1, 2, 3, 4, 5};
  Integer[] testArray1 = {5, 3, 2, 1, 4};
  Integer[] testArray2 = {3, 2, 4, 1, 5};
  Integer[] testArray3 = {1, 5, 3, 4, 2};
  Integer[] emptyArray = {};
  Integer[] singleton = {1};
  Integer[] alreadySorted = {1, 2, 3, 4, 5};
  Integer[] halfSorted = {1, 2, 3, 5, 4};
  Integer[] repetitiveArray = {2, 1, 3, 1, 4};
  Integer[] negativeArray = {-2, -3, -5, -1, -4};
  Integer[] zeroArray = {1, 0, 2};

  InsertionSort InsertionSorter = new InsertionSort();
  MergeSort MergeSorter = new MergeSort();
  QuickSort QuickSorter = new QuickSort();
  FreitasLiviaSort FreitasLiviaSorter = new FreitasLiviaSort();

  BasicComparator<Integer> newComparator = new BasicComparator<Integer>();

  @Test
  public void unsortedTest(){
    InsertionSorter.sort(testArray1, newComparator);
    assertTrue(Arrays.equals(testArray1, sorted));
    MergeSorter.sort(testArray2, newComparator);
    assertTrue(Arrays.equals(testArray2, sorted));
    FreitasLiviaSorter.sort(testArray3, newComparator);
    assertTrue(Arrays.equals(testArray3, sorted));
    //add tests for the other sorts
  }
  /**
  * Checks if the empty array is handled gracefully
  */
  @Test
  public void emptyArrayTest(){
    InsertionSorter.sort(emptyArray, newComparator);
    assertTrue(Arrays.equals(emptyArray, new Integer[0]));
    MergeSorter.sort(emptyArray, newComparator);
    assertTrue(Arrays.equals(emptyArray, new Integer[0]));
  }

  /**
  * Checks if the singleton array is handled gracefully
  */
  @Test
  public void singletonTest(){
    Integer[] singletonTest = {1};
    //INSERTION SORT
    MergeSorter.sort(singleton, newComparator);
    assertTrue(Arrays.equals(singleton, singletonTest));
  }

  /**
  * Checks if the sort works for an already sorted array
  */
  @Test
  public void alredySortedTest(){
    MergeSorter.sort(alreadySorted, newComparator);
    assertTrue(Arrays.equals(alreadySorted, sorted));
  }

  /**
  * Checks if a half-sorted array is sorted properly
  */
  @Test
  public void halfSortedTest(){
    MergeSorter.sort(halfSorted, newComparator);
    assertTrue(Arrays.equals(halfSorted, sorted));
  }

  /**
  * Checks if a array made of one repeated element is sorted properly
  */
  @Test
  public void repeatedElementTest(){
    Integer[] repetitiveTest = {1, 1, 2, 3, 4};
    InsertionSorter.sort(repetitiveArray, newComparator);
    assertTrue(Arrays.equals(repetitiveArray, repetitiveTest));
  } 

  /**
  * Checks if negative numbers are sorted properly
  */
  @Test
  public void negativeNumbersTest(){
    Integer[] negativeTest = {-5, -4, -3, -2, -1};
    MergeSorter.sort(negativeArray, newComparator);
    assertTrue(Arrays.equals(negativeArray, negativeTest));

  }

  /**
   * Checks if zero is handled properly
   */
  @Test
  public void zeroTest(){
    Integer[] zeroTest = {0, 1, 2};
    MergeSorter.sort(zeroArray, newComparator);
    assertTrue(Arrays.equals(zeroArray, zeroTest));
  }

  public void main(String args[]) throws Exception{

  }
}