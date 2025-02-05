class Transport{
    void display(){
        System.out.println("transport display called");
    }
}
class Bus extends Transport{
    void display(){
        System.out.println("bus display called");
    }
}
class Car extends Transport{
    void display(){
        System.out.println("car display called");
    }
}
public class poly {
    public static void main(String[] args){
        Car c =  new Car();
        c.display(); 
        Bus b = new Bus();
        b.display();
        Transport c2 = new Car(); // object of cat and reference of animal
        c2.display(); 
    }
}
 