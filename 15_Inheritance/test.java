class transport{
    transport(String s){
        System.out.println("Transport's contructor called");
    }
}

class Bus extends transport{
    Bus(int a){
        super("hello");
        System.out.println("Bus's contructor called");
    }
}

class Car extends Bus{
    Car(){
        super(12);
        System.out.println("Car's contructor called");
    }
}
public class test {
    public static void main(String[] args) {
        Car c =  new Car();
        // transport --> bus --> car 
    }   
}
