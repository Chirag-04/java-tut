class Student{
    private String name;
    private int age;
    void setStudentAge(int age){
        this.age = age;
        if(age < 0){
            System.out.println("Warning!! You are trying to set negative age");
        }
        this.age = 0;
    }
    int getStudentAge(){
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentAge(-120);
        System.out.println("Student's age : "+ s.getStudentAge());
    }
}
