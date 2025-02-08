import java.util.Scanner;
class Utils{
    public static String trimAndUpperCase(String s){ // accessible outside the class 
        if(s.isEmpty()){
            return "";
        }else{
            return s.trim().toUpperCase();
        }
    }
}
public class utility {
    public static void main(String[] args) {
        // no need to create an object
        System.out.println("Enter a string");
        Scanner scn =  new Scanner(System.in);
        String s =  scn.nextLine();
        System.out.println(Utils.trimAndUpperCase(s));
    }
}
