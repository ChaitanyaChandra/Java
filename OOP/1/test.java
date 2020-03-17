public class test{
    public static void main(String[] args) {
        car test  = new car();
        test.setColor("green");
        System.out.println(String.format("this is a %s color of a car "
                ,test.getColor()));
    }
}