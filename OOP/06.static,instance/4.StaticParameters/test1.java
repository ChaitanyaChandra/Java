public class test1 {
    private static String name;

    public static void print(String whatIsYourName){
        test1.name = whatIsYourName; // called using the class name
        System.out.println("your name is " + whatIsYourName);
    }

    public  void printname(){
        System.out.println("your name is " + name + " stored in static variable ");
    }

}
