interface camera{
    public static int pixel = 20;
    public void clickPhoto();
}
interface music{
    public static int songs = 200;
    public void playSong();
}
interface phoneCall{
    public static int directory = 50;
    public void makeCall();
}

class Mobile implements camera , music , phoneCall{
    int price  =  10000;
    @Override
    public void clickPhoto(){
        System.out.println("Phone clicks photo");
    }

    @Override
    public void playSong(){
        System.out.println("Phone plays song");
    }

    @Override
    public void makeCall(){
        System.out.println("Phone makes call");
    }
    public void sayHI(){
        System.out.println("hi!! ios here");
    }
}
public class test {
    public static void main(String[] args) {
        System.out.println("hi");
        Mobile b = new Mobile();
        System.out.println("price of phone is " +  b.price);
        b.sayHI();
        b.makeCall();
        System.out.println("total number of songs are  " +  b.songs); // not a static way
        System.out.println(music.songs);
        System.out.println(phoneCall.directory);

    }
}
