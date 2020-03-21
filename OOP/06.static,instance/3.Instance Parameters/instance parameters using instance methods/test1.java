public class test1 {
    private  String name;

    public  void print(String whatIsYourName){
        this.name = whatIsYourName; // // instance variables are declared with this.
        System.out.println("your name is " + whatIsYourName);
    }

    public void printname(){
        System.out.println("your name is " + name + " stored in instance variable ");
    }

}
