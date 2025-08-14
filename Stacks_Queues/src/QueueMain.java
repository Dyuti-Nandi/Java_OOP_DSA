public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue();
        CircularQueue queue = new CircularQueue(6);

        queue.add(6);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(8);
        queue.add(5);

        queue.display();

        System.out.println(queue.remove());
        queue.add(10);

        queue.display();

    }
}
