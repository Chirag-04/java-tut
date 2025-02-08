class Student{
    public static Student student;
    private Student(){
        // restricting 
    }
    public static Student createObject(){
        if(student == null){
            student = new Student();
        }
        return student;
    }
}
public class SingleObject {
    public static void main(String[] args) {
        System.out.println("hi");
        Student.createObject();
    }
}
