public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int front = 0;
    int end = 0;
    int size = 0;

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return size == data.length-1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean add(int item){
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("The Queue is Empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("The Queue is Empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int i = front;
        do{
            System.out.print(data[i]+" -> ");
            i++;
            i = i % data.length;

        }while (i!=end);
        System.out.println("END");
    }
}
