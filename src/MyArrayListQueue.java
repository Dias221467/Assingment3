import java.util.NoSuchElementException;
public class MyArrayListQueue<T> implements Queue<T> {
    MyArrayList<T> list = new MyArrayList<T>();
    private T[] arr;
    private int size;
}
