
public class test {
    public static void main(String[] args){
        int a = 10; // scope of this variable is from line 3-12
        int b = 20; // scope of this variable is from line 3-12
        { 
            int c =  90; // scope is from line 6-11
        System.err.println("c is " + c); // 11
            a++;
            b++;
        }
        // System.err.println("c is " + c);// gives error
        System.err.println("a is " + a); // 11
        System.err.println("b is " + b); // 21
    }
}
