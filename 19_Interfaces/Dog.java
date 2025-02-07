interface Animal{
    int max_age =  1000;
    void eat(); // using abstract keyword is redundant
    void sleep();
}

// so we will create a class that will implement this interface
public class Dog implements Animal{
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Dog is sleeping");
    }

}
public class Practice {
    public static void main(String[] args) {
        System.out.println("hi");
    }
}
