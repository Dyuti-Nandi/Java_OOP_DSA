public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean add(int item){
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public boolean isFull(){
        return end == data.length-1;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("The Queue is Empty");
        }
        int removed = data[0];
        for(int i=1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("The Queue is Empty");
        }
        return data[0];
    }

    public void display(){
        for(int i=0; i<end; i++){
            System.out.print(data[i]+" <- ");
        }
        System.out.println("END");
    }
}
