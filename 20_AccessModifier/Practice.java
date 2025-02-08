class Animal{
    private String name; // accessible within the class
    protected String sound;
    public Animal(String name , String sound){
        this.name =  name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(name + " makes sound " + sound);
    }

    protected void changeSound(String newSound){ // accessible within the class + class inheriting it 
        this.sound = newSound;
    }
}
class Dog extends Animal{
    public Dog(String name){ // public constructor (object can be created)
        super(name, "Bark");
    }
    public void wagTail(){ // accessible outside 
        System.out.println(getName() + "wages tail");
    }
    private String getName(){ // not be able to access outside 
        return getClass().getSimpleName();
    }
    public void setDogSound(String newSound){ // accessible outside the class
        changeSound(newSound); // but this method is accessible withing dog class
    }
}
public class Practice {
    public static void main(String[] args) {
        Dog d = new Dog("Sheru");
        d.wagTail();
        d.makeSound();
        d.changeSound("woof woof !!!");
        d.makeSound();
    }
}
