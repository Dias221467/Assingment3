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

__Description:__ _This code defines a method called peek that returns the first element of a queue represented by an instance of MyArrayListQueue, without removing it from the queue. It assumes that the queue is stored as a list, and uses the get method of the list to retrieve the first element. The method throws a NoSuchElementException if the queue is empty, which means that there are no elements to peek at. The method returns a generic type T, which represents the element at the front of the queue._

__Solution:__
````Java
public T peek() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.get(0);
    }
````

#### isEmpty

__Description:__ _This code defines a method called isEmpty that checks whether a queue represented by an instance of MyArrayListQueue is empty. It assumes that the queue is stored as a list, and uses the isEmpty method of the list to check whether it is empty. The method returns a boolean value true if the queue is empty, and false otherwise._

__Solution:__
````Java
 public boolean isEmpty() {
        return list.isEmpty();
    }
````

### MyArrayListStack

#### print_stack

__Description:__ _This code defines a method called print_stack that prints the elements of a stack represented by an instance of MyArrayListStack. It assumes that the stack is stored as a list, and uses a loop to iterate over the elements of the list in reverse order, starting from the top of the stack. It prints each element followed by a comma and space, except for the last element. Finally, it prints a closing square bracket and a newline character._

__Solution__
````Java
public void print_stack(){
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

#### Size

__Description:__ _This method returns the number of elements in the stack. It calls the size() method of the underlying MyArrayList instance that stores the elements of the stack and returns the result. The size() method of MyArrayList returns the number of elements in the list. In other words, this method returns the size of the stack._

__Solution__
````Java
 public int size() {
        return list.size();
    }
````

#### push

__Description:__ _This method adds an element to the top of the stack. It takes a generic type parameter 'T' as input, which is the element to be added to the stack. The method simply calls the add method of the underlying MyArrayList instance to add the element to the end of the list. This operation is equivalent to adding the element to the top of the stack, as the last element added to the list will be the first element to be removed when popping from the stack._

__Soltuion__
````Java
public void push(T element) {
        list.add(element);
    }
````

#### pop

__Description:__ _This method removes and returns the top element of the stack. It first checks if the list is empty and throws an EmptyStackException if it is. Otherwise, it uses the remove method of the list object to remove and return the last element in the list, which is the top element of the stack since we are using a Last-In-First-Out (LIFO) approach. The cast to (T) is necessary because the remove method returns an Object type, so we need to cast it to the generic type T of the stack._

__Solution__
````Java
public T pop() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) list.remove(list.size() - 1);
    }
````

#### peek

__Description:__ _This is a method for the MyArrayListStack class that returns the top element of the stack without removing it. The method first checks if the list is empty using the isEmpty() method. If the list is empty, it throws an EmptyStackException. Otherwise, it returns the last element in the list using the get() method with an index of list.size() - 1, which is the index of the last element in the list._

__Solution__
````Java
public T peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }
````

#### isEmpty

__Description:__ _The isEmpty method checks if the stack is empty or not. It returns true if the stack is empty, and false otherwise. The implementation is quite simple, as it just returns the result of calling the isEmpty method of the underlying MyArrayList instance._

__Solution__
````Java
 public boolean isEmpty() {
        return list.isEmpty();
    }
````