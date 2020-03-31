// main class 
public class User{
    public static void main(String[] args) {
        Mobile mobile = new Mobile("apple");
        Logo logo = new Logo("white");
        Resolution resolution = new Resolution("1920*1080");
        Screen screen  = new Screen("apple","good",logo,resolution);
        touch thetouch = new touch(mobile,screen,logo,resolution);

        System.out.println(thetouch.getResolution().getNativeResolution());
        thetouch.Getmobilename();

    }
}