public class Dog extends Animal{
    private String tail;
    private String haircolor;


    //dog(parameters inheritance from other class and parameters from [dog class])
    public Dog(String name,  String breed ,String tail,String hairColor) {
        super(name, 12, breed); // call the constructor that class extends from (animal)
        // pass values in the super class
        this.tail = tail;
        this.haircolor = hairColor;
    }

    // private method
    private void SenceDistance(){
        System.out.println("2. Sencedistance called in Dog");
    }

/*
    list of methods available in the animal class including constructors
    create a methods that overwritten from main class (Animal class)
    same method that exist in the main class (Animal class) that make unique in Dog class
 */

    @Override // method overriding
    public void Sence() {
        System.out.println("3. sence method (Override) called in Dog");
        SenceDistance(); // private method calls in public
        super.Sence(); // call the extend animal
    }

    public void call1(){
        System.out.println("12. called from subclass ");
        super.call(); // calling super class
        //12. called from subclass
        //11.called from super class
    }

    public void call2(){
        System.out.println("13. called from subclass ");
        call(); // calling individual class (itself) [below class]
        //13. called from subclass
        //14. called from subclass
    }


    public void call(){ //called [here]
        System.out.println("14. called from subclass ");
        super.call(); // calling from sub class to super class
        //11.called from super class
    }


}
