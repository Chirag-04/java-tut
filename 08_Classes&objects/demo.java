import java.util.Scanner;

class Calculator {
    // properties and methods
    public int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
}

public class demo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        // creating an object
        Calculator calc = new Calculator();
        int result = calc.add(a, b);
        System.out.println("result is" + result);
    }
}
