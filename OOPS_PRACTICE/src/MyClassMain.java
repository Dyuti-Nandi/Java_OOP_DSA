public class MyClassMain {
    public static void main(String[] args) throws Exception {
        MyClass s1 = new MyClass(5);

        s1.addStudent(1, "Divya", 99.00F);
        System.out.println(s1.addStudent(2, "Priti", 65.00F));
        s1.addStudent(3, "Shreya", 100.00F);
        s1.addStudent(4, "Divyansh", 82.00F);
        s1.addStudent(5, "Prerna", 74.00F);
//        s1.addStudent(6, "Shila", 65.00F);

        s1.display();
        System.out.println();
        s1.findTopper();
        System.out.println();
        s1.findStudentByRollNo(5);
    }
}
