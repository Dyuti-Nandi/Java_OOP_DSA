public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if (isFull()) {
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("The stack is Empty!!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("cannot throw from an empty stack!!");
        }
        return data[ptr];
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(6);

//        System.out.println(stack.push(34));
        stack.push(28);
        stack.push(84);
        stack.push(75);
        stack.push(65);
        stack.push(84);
        stack.push(24);
        System.out.println(stack.push(24));

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        System.out.println(stack.pop());

//        System.out.println(stack.peek());
    }
}
