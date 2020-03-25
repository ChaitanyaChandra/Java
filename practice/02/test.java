public class test{
    public static void main(String[] args) {

        Parts test = new Parts();
        Vehicale test1 = new Vehicale();

        System.out.println(test.getName());
        System.out.println(test1.getName());

        test1.carName();
        test1.carName("jaguar");

    }
}

/*
door
front Glass
your car name is Audi
your car name is jaguar
 */