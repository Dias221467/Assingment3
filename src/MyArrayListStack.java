import java.util.EmptyStackException;
public class MyArrayListStack<T> extends MyArrayList<T> {
    MyArrayList<T> list = new MyArrayList<T>();
    private T[] arr;
    private int size;
    public MyArrayListStack(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    public void push(T element) {
        list.add(element);
    }
    public T pop() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) list.remove(list.size() - 1);
    }
    public T peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }
}
