public class test{
    public static void main(String[] args) {
        Animal dog = new Animal("GermanShapardDog",13,"GermanShapard");
        System.out.println(String.format("dog name :%s",dog.getName()));
        Dog dog1 = new Dog("LabradorDog","Labrador","medium","white and black");
        System.out.println(String.format("name :%s",dog1.getName()));
        dog1.eat(-80);
        dog1.Sence();

        System.out.println("\n\t\t\t\t\t***************************\t\t\t\t\n");

        dog1.call1();

        System.out.println("\n\t\t\t\t\t***************************\t\t\t\t\n");

        dog1.call2();

        System.out.println("\n\t\t\t\t\t***************************\t\t\t\t\n");
    }
}