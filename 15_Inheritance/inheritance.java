
class Transport{
    int price;
    String color;

    void speed(){
        System.out.println("old speed");
    }
}

class Bus extends Transport{  // bus will inherit prop and method from transport class
    @Override
    void speed(){
        System.out.println("new speed");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.speed();
        // b.newSpeed();//error
    } 
}

