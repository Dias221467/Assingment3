# Assingment3
## Ibragimov Dias SE-2217
###  MyArrayListQueue
#### Size()

__Description:__ _This code defines a method called size that returns the number of elements in a list. It assumes that the list is an instance of MyArrayList and calls the size method of the list to get the size of the list. The method returns an integer value representing the number of elements in the list._

__Solution:__
````Java
public int size() {
        return list.size();
    }
````

#### Print_queue

__Description:__ _This code defines a method called print_queue that prints the contents of a queue represented by an instance of MyArrayListQueue in reverse order. It assumes that the queue is stored as a list, and iterates over the list in reverse order using a for loop, starting from the last element and ending at the first element. The method prints each element of the queue, separated by a comma and a space, using the System.out.print method. It then prints a closing square bracket to indicate the end of the queue._

____
````Java
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
````
#### Enqueue

__Description:__ _
This code defines a method called enqueue that adds an element to the end of a queue represented by an instance of MyArrayListQueue. It assumes that the queue is stored as a list, and adds the element to the end of the list using the add method of the list. The method takes a generic type T as its argument, which represents the element to be added to the queue. The method does not return any value._

__Solution:__
````Java
public void enqueue(T element) {
        list.add(element);
    }
````

#### Dequeue

__Description:__ _This code defines a method called enqueue that adds an element to the end of a queue represented by an instance of MyArrayListQueue. It assumes that the queue is stored as a list, and adds the element to the end of the list using the add method of the list. The method takes a generic type T as its argument, which represents the element to be added to the queue. The method does not return any value._

__Solution:__
````Java
public T dequeue() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return (T) list.remove(0);
    }
````

#### Peek

__Description__