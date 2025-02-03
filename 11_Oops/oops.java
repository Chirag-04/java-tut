class Car{
    String color;
    private int year; // data hiding
    String model;
    String brand;
    private int speed;

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    // same for speed
}
public class oops {
    public static void main(String[] args) {
        Car c = new Car();
        // c.year = 2023;
        c.setYear(2023);
        System.out.println(c.getYear());
    } 
}
