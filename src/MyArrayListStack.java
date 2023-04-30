public class MyArrayListStack<T> extends MyArrayList<T> {
    private T[] arr;
    private int size;
    public MyArrayListStack(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
}
