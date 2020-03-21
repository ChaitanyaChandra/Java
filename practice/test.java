public class test{
    // class is a blueprint of creating objects
    public static void main(String[] args) {
        Animal dog = new Animal();
        Dog one = new Dog();
        //one (reference to the object in memory)  = new (operator) dog (instance)
        one.run(100);
        one.walk(100);

    }
}
/*
name:GermanShapard and breed :GermanShapard
name:lab and breed :lab
1.animal run at speed :2.40kph
1.animal walk at speed :1.20kph
 */