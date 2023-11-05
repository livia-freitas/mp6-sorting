package mp6;
import java.util.Comparator;

public class BasicComparator<T extends Comparable<T>> implements Comparator<T> {
  public int compare(T a, T b) {
    return b.compareTo(a);
  }
}