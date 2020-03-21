public class test {
    public static void main(String[] args) {
        house test = new house("green");
        // test = reference to the object (house)
        // new (operator)
        // house (instance)

        house anothertest = test;
        // two references pointing to the object house
        System.out.println(test.getColor()); // green
        System.out.println(anothertest.getColor()); // green


        anothertest.setColor("yellow");
        // object is changed and both got same answer
        // because both references are pointing to the same object
        System.out.println(test.getColor()); // yellow
        System.out.println(anothertest.getColor()); // yellow

        house test3 = new house("red"); // creating new reference
        anothertest = test3;
        // one reference is changed to pointing to the new object (instance)

        System.out.println(test.getColor()); // yellow
        System.out.println(anothertest.getColor()); // red
        System.out.println(test3.getColor()); // red
    }
}
/*
green
green
yellow
yellow
yellow
red
red
 */