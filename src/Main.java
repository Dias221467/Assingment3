
        public class Main {
            public static void main(String[] args) {
                // Test MyArrayListStack
                MyArrayListStack<Integer> stack = new MyArrayListStack<>();
                System.out.println("Is stack empty? " + stack.isEmpty()); // true
                stack.push(1);
                stack.push(2);
                stack.push(3);
                System.out.println("Stack size: " + stack.size()); // 3
                stack.print_stack(); // [3, 2, 1]
                System.out.println("Top element of stack: " + stack.peek()); // 3
                System.out.println("Popped element: " + stack.pop()); // 3
                stack.print_stack(); // [2, 1]

                // Test MyArrayListQueue
                MyArrayListQueue<String> queue = new MyArrayListQueue<>();
                System.out.println("Is queue empty? " + queue.isEmpty()); // true
                queue.enqueue("hello");
                queue.enqueue("world");
                queue.enqueue("!");
                System.out.println("Queue size: " + queue.size()); // 3
                queue.print_queue(); // [hello, world, !]
                System.out.println("Front of queue: " + queue.peek()); // hello
                System.out.println("Dequeued element: " + queue.dequeue()); // hello
                queue.print_queue(); // [world, !]
                queue.flush(); // empty the queue
                System.out.println("Is queue empty? " + queue.isEmpty()); // true
            }
        }

