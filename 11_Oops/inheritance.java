
class Vehicle{
    String color;
    int numTyres;
}
class Bus extends  Vehicle{
    int speed;
}
public class inheritance {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.color = "Blue";
        b.speed = 100;
        b.numTyres =  4;
        System.out.println(b.color);
        System.out.println(b.numTyres);
        System.out.println(b.speed);
    }
}
