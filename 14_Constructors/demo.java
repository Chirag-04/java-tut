class Student{
    String name;
    int age;
    String school;
    public Student(String name , int age , String school){
        this.name = name;
        this.age =  age;
        this.school = school;
    }
}
public class demo {   
    public static void main(String[] args) {
        Student s =  new Student("Chirag" , 22 , "NSUT");
        System.out.println(s.name + " " + s.age + " "+ s.school);
    } 
}
