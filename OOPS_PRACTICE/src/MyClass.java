public class MyClass {
    public int[] rollNo;
    public String[] name;
    public float[] marks;
    public int length;
    int size = 0;

    public MyClass(int length) {
        this.rollNo = new int[length];
        this.name = new String[length];
        this.marks = new float[length];
    }

    public boolean addStudent(int rollNo, String name, float marks) throws Exception {
        if(size >= this.rollNo.length){
            throw new Exception("No more space!!");
        }
        else{
            this.rollNo[size] = rollNo;
            this.name[size] = name;
            this.marks[size] = marks;
        }
        size++;
        return true;
    }

    public void display(){
        for(int i=0; i<size; i++){
            System.out.println("Name: "+name[i]+", Roll No: "+rollNo[i]+", Marks: "+marks[i]);
        }
    }

    public void findTopper(){
        int topperIndex = 0;

        for(int i = 1; i<size; i++){
            if(marks[i] > marks[topperIndex]){
                topperIndex = i;
            }
        }
        System.out.println(name[topperIndex]+" is the Topper with marks "+marks[topperIndex]);
    }

    public void findStudentByRollNo(int roll){
        for (int i=0; i<size; i++) {
            if (rollNo[i] == roll) {
                System.out.println(name[i]+" is the student with Roll No: "+roll);
                return;
            }
        }
    }
}
