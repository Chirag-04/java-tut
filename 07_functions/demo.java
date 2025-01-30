
import java.util.Scanner;

public class demo{
    
    static int sum_of_two_numbers(int a , int b){
        int sum  = a +b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = sum_of_two_numbers(a, b);
        System.out.println("Sum of two numbers is "+ sum);
    }
}