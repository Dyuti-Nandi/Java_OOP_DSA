import java.util.*;

public class BuiltInStack {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(28);
//        stack.push(84);
//        stack.push(75);
//        stack.push(65);
//
//        System.out.println(stack.pop());
//        System.out.println(stack);


        Queue<Integer> queue = new LinkedList<>();
        queue.add(45);
        queue.add(64);
        queue.add(17);
        queue.add(22);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());

        System.out.println(queue);

//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(25);
//        deque.add(63);
//        deque.add(30);
//        deque.add(82);
//        deque.addLast(21);
//        deque.addFirst(22);
//        deque.addFirst(25);
//
//        System.out.println(deque);
//        System.out.println(deque.remove());
//        System.out.println(deque.remove());
//        System.out.println(deque.removeLast());
//
//        System.out.println(deque);
//        System.out.println(deque.removeLastOccurrence(34));
    }
}
