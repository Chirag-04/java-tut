
 class Student{
    public int age;
    public String name ; 
    public void study(){
        System.out.println("student studies");
    }
}

public class School {
    public static void main(String[] args) {
        System.out.println("hi");
        Student s = new Student();
        s.age =  10;
        s.name = "Chirag";
        System.out.println("age" + " " + s.age );
        System.out.println("name" + " " + s.name );
        s.study();
    }

}
