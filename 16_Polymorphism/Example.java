class Animal{
    void makeSound(){
        System.out.println("animal makes sound");
    }
    void AnimalSwims(){
        System.out.println("animal swims");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
    void catchBall(){
        System.out.println("Dog catces ball");
    }
}
public class Example{
    public static void main(String[] args) {
        Animal d=  new Dog();
        d.makeSound(); // based on object at run time jvm will call methods 
       ((Dog) d).catchBall(); //To call child-specific methods, you need explicit casting
        d.AnimalSwims(); // since refernce of d is of animal so all the method in animal class are accessible
    }
}