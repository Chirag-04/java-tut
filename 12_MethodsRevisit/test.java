class Student{
    int marks;
    String name;
}
public class test {
    public static void changeArray(int []arr){
        arr[0] = 10;
        System.out.println("first element " + arr[0]); // 10
    }
    public static void changeObject(Student s){
        s.name = "Chirag Maini";
        s.marks = 100;
        System.out.println("name : " + s.name + " " + "marks : " + s.marks);
    }
    public static void main(String[] args) {
        int []arr = {4,6,7,8,9};
        changeArray(arr);
        System.out.println("first element " + arr[0]); // 10
        Student s = new Student();
        s.name = "Chirag";
        s.marks =  50;
        changeObject(s);
        System.out.println("name : " + s.name + " " + "marks : " + s.marks); // updated 

    }
}
