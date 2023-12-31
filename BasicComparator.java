package mp6;
import java.util.Comparator;

/**
 * Author: Livia Stein Freitas.
 * Implements a basic comparator to use for the sort algorithms.
 */
public class BasicComparator<T extends Comparable<T>> implements Comparator<T> {

  public BasicComparator(){

  }
  /**
   * Takes in two objects. Compares them. Returns a positive integer if a is bigger than b.
   */
  public int compare(T a, T b) {
    return b.compareTo(a);
  }
}