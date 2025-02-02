
class Calculator{

    public int add(int a , int b){
        return a+b;
    }

    public int add(int a , int b , int c){
        return a+b+c;
    }

    public double add(double a , int b){
        double res =  a + (double)b;
        return  res;
    }
}

public class test {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int x = 30;
        double d =12.43;
        Calculator c = new Calculator();
        int res = c.add(a , b);
        System.out.println(res); // 30
        System.out.println(c.add(a , b , x)); // 60
        System.out.println(c.add(d , b)); // 32.43
    }   
}
