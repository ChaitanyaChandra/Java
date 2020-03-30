// test class
public class User {
    private static Object Logo;

    public static void main(String[] args) {
        Mobile themobile = new Mobile("apple");
        Logo thelogo  = new Logo("white");
        Resolution theresolution = new Resolution("1920x1080");
        Screen thescreen = new Screen("applw",thelogo,theresolution);
        touch thetouch = new touch(themobile,thescreen,thelogo,theresolution);

        //accessing the methods from the composition setter (all parts)
        thetouch.start();
        System.out.println("------------------------------------------------------------");
        thetouch.stop();
    }
}