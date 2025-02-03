
public class test {
    public static void main(String[] args) {
        String name1 =  new String("Chirag");
        String name2 =  new String("Chirag");

        String surname =  "Maini";
        String surname2 = "Maini";

        System.out.println(name1 == name2);// false
        System.out.println(surname == surname2); // true

    }
}
