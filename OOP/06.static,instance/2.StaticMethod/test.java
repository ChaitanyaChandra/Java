public class test {
    public static void main(String[] args) {
        test1.printsum(2,3); // calling static method from child class
        print(); // calling static method within parent class

    }

    // static methods are declared using a static modifier and dont use (this)
    public static void print(){
        System.out.println("this is chaitanya");
    }
}
/*
sum = 5
this is chaitanya
 */