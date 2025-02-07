interface Animal{
    int max_age =  1000;
    void eat(); // using abstract keyword is redundant
    void sleep(); // public keyword is also redundant
}

// so we will create a class that will implement this interface
class Dog implements Animal{
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
        Dog d = new Dog();
        d.eat();
        d.sleep();
        System.out.println(d.max_age);
        System.out.println(Animal.max_age); // we can access the properties through animal as well
        
    }
}
