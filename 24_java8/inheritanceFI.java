
@FunctionalInterface
interface Parent{
    public void sayHello();
}

@FunctionalInterface
interface Child extends Parent{
    // inherit the sayHello() fn so it has exactly one abstract methdod
    // public void sayBye() ; // not a functional interface
    default void sayOK(){

    }
    public static void greet(){
        
    }
}

public class inheritanceFI {

}
