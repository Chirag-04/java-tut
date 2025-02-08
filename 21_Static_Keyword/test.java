class Student {
    private int id;
    private String name;
    private int age;
    public static int student_count = 0;
    static{
        System.out.println("hi!! i am here");
    }
    public Student(){
        student_count++;
    }
    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getCount(){
        System.out.println("total number of students  : " + student_count);
    }
}

public class test {
    public static void main(String[] args) {
       Student s1 = new Student();
       Student s2 = new Student();
       Student s3 = new Student();
       Student s4 = new Student();
       Student.getCount();
    }
}
