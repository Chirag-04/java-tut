class Parent{
    int x = 10;
    void display(){
        System.out.println("Parent class display method");
    }
}
class Child extends Parent{
    void display(){
        super.display();
        System.out.println("parent's varible inside child class" + " " +super.x);
        System.out.println("Child class display method");
    }
}

public class newFile {
    public static void main(String[] args) {
        Child c =  new Child();
        c.display();
    }
}


