public class Methods {
    public static void main(String[] args) {
        // in java strings are immutable
        String s = "chirag maini";
        String t = "Cirag Maini";
        String p =  "CHIRAG MAINI";
        // length
        System.out.println("length : "+ s.length());
        // charAt
        System.out.println(s.charAt(8));
        // s1.equals(s2)
        System.out.println(s.equals(p));
        // s1.equalsIgnoreCase(s2)
        System.out.println(s.equalsIgnoreCase(p));
        // s1.compareTo(s2) gives integer representing the difference of first chaging characters in two strings
        System.out.println('c'+0); // 99
        System.out.println('C'+0); // 67
        System.out.println(s.compareTo(p)); // 'c' and 'C' have diff ascii value 
        // s1.compareToIgnoreCase(s2)
        System.out.println(s.compareToIgnoreCase(p));
        // s1.substring(beginIndex , endIndex(excluding))
        System.out.println(s.substring(0)); // gives the substring from 0 till end 
        System.out.println(s.substring(3,8));
        // 8 is excluding "rag m"
        // s1.toUpperCase
        System.out.println(s.toUpperCase());
        // s1.toLowerCase
        System.out.println(s.toLowerCase());
        // s1.trim() : used to trim the extra space
        String sports = "      Cricket    ";
        System.out.println(sports.trim()); // "Cricket"
        System.out.println(sports.trim().length()); // 7 
        // s.replace(substring1 , substring2)
        String name = "Rahul Arya";
        System.out.println(name.replace("Rahul", "Kunal"));
        // s.contains(s2) : return boolean to check whether a substring is present in another substring or not
        System.out.println(name.contains("hul"));
        System.out.println(name.contains("Rahul Arya"));
        // s.startsWith(s2) : returns boolean checking whether a string startswith a substring or not 
        System.out.println(name.startsWith("arya")); // false
        System.out.println(name.startsWith("arya"));  // true
        // s.endsWith(s2):  same as startsWith
        String food = "      ";
        // s.isEmpty(): return true if s.length = 0
        System.out.println(food.isEmpty()); // true
        // s.isBlank(): return true if string contains any other charcter than space
        System.out.println(food.isBlank()); // false

        // s.indexOf("a") : for finding appearce of a charcter
        System.err.println(name.indexOf('h'));
        // s.lastIndexOf("a") : used to find the last index of character in case mutiple character exists
        // sting s =  String.valueOf(a)
        // used to convert integer to string 
        int number  = 124;
        String str= String.valueOf(number);
        System.out.println("converted string " + str );
        System.out.println(str.charAt(0));
    }
}
