 class Student{
    int age;
    String name;
    int marks;
 }

public class ArrayofObjects {
    public static void main(String[] args) {
         Student s1 = new Student();
         s1.age = 23;
         s1.name = "Chirag";
         s1.marks = 99;
         //
         Student s2 = new Student();
         s2.age = 19;
         s2.name = "John";
         s2.marks = 67;
         //
         Student s3 = new Student();
         s3.age = 26;
         s3.name = "Jos";
         s3.marks = 88;

         // lets create an array which will sotre the refernce to these objects
        //  int arr[] = new int[3];
         Student nums[] = new Student[3];
         nums[0] = s1;
         nums[1] = s2;
         nums[2] = s3;
         for(Student  s :  nums){
            System.out.println(s.name + " " + s.age+ " "+ s.marks);
         }
    }   
}
