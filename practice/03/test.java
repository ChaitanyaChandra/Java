public class test {
    public static void main(String[] args) {
        Vehicale test1 = new Vehicale();
        Parts test = new Parts();
        test.setName("benz");
        System.out.println(test.getName());
        System.out.println(test1.getName());
        test.Status("bad");
        System.out.println(test.getStatus());
        System.out.println(test1.getStatus());

    }
}
/*
benz
Audi
bad
Good
 */