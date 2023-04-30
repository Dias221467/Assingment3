import java.util.NoSuchElementException;
public class MyArrayListQueue<T> implements Queue<T> {
    MyArrayList<T> list = new MyArrayList<T>();
    private T[] arr;
    private int size;
    public MyArrayListQueue(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    public void print_queue(){
        System.out.print("[");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public void enqueue(T element) {
        list.add(element);
    }
}
