import java.util.EmptyStackException;
public class MyArrayListStack<T> extends MyArrayList<T> {
    MyArrayList list = new MyArrayList();
    private T[] arr;
    private int size;
    public MyArrayListStack(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    public void push(T element) {
        list.add(element);
    }

}
