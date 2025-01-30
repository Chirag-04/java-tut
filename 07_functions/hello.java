
import java.util.Scanner;
public class hello {
    static String send_name(String firstName , String secondName){
        String full_name = firstName+" " +secondName;
        return full_name;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String firstName = scn.next();
        String secondName = scn.next();
        String full_name = send_name(firstName , secondName);

        System.err.println("Full name is "+ full_name);
    }
}
