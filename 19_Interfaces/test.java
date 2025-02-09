interface Animal{
    public static int max_age =  100; // static variable 
    public void sleep();  // abstract 
    public void eat(); 
    static void yawn(){ // static methods are valid 
        System.out.println("Animal is yawning");
    }
    default void run(){ // we can write only deafult concerete methods in an interface
        this.eat();
        this.sleep();
        System.out.println("Animal is running");
    }
}

class Dog implements  Animal{
    @Override
    public void sleep(){
        System.out.println("Dof is sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
}

public class test {
    public static void main(String[] args) {
        Dog d = new Dog(); 
        // Animal.run() ; // gives error
        d.run();
    }
}
