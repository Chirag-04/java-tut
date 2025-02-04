
public class Method {
    public static void  sum_of_list(int ...a){
        for(int ele :  a){
            System.out.println(ele);
        }
    }
    public static void main(String[] args) {
        sum_of_list(1,2,3,4,5);
    }
}
