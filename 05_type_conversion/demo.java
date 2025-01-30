

// type conversion and casting
// int a ; byte b;
// if i do b =a (gives an error ) lossy conversion from int to byte as int has bigger range and byte has smaller range 
// but a = b works fine

public class demo {
    public static void main(String[] args) {
        byte a= 10;
        byte b =20;
        int result = a*b;
        System.out.println(result);  
    }
}
