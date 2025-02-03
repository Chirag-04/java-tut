
class Student{
    int marks;
    String name;
}
public class demo {
    public static void main(String[] args) {
        int a = 10; // 10 will get stored in a 
        System.out.println("inside a ->" + a);
        Student s1 = new Student(); // this s1 will store the address/ reference of an object
        System.out.println("inside s1 ->" + s1);
        s1.marks =  10;
        s1.name = "Chirag";

    }    
}
