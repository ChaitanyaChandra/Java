public class test1 {
    private static  String name;

    public  void print(String whatIsYourName){
        test1.name = whatIsYourName; // static variables are declared with class name
        System.out.println("your name is " + whatIsYourName);
    }

    public void printname(){
        System.out.println("your name is " + name + " stored in static variable ");
    }

}
