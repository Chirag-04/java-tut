public class work {
    // return type does not matter
    // type and number of argument do
    int add(int a , int b){
        return a+b;
    }
    int add(int a , int b, int c){
        return a+b;
    }
    int add(){
        return 0;
    }
    // void add(int a , int b ){
    //     return a+b;
    // }
    int add(float a , int b){
        return (int)a+b;
    }
    public static void main(String[] args){
        System.out.println("hi");
        int res = 3 + 4 ;
        float result =  3f + 4f;
        String newString =  "chirag"+"maini";
        System.out.println(res);
        System.out.println(result);
        System.out.println(newString);
    }
}
