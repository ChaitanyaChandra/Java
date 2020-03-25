public class Vehicale {

    // declaring a varibles
    private String name ;
    private String kind ;
    private String carName;

    // default constructor
    public Vehicale(){
        this("front Glass","Glass"); // this is used to remove the duplicate of constructor
    }


    // constructor method
    public Vehicale(String whatIsNameOfPart , String whatIsKindOfpart ){
        this.name  = whatIsNameOfPart;
        this.kind = whatIsKindOfpart;
    }


    // using  encapsulation
    public void setName(String nameOfPart){
        this.name = nameOfPart;
    }
    public String getName(){
        return this.name;
    }

    public void setKind(String kindOfPart){
        this.kind = kindOfPart;
    }
    public String getKind(){
        return this.kind;
    }

    // creating a method for overriding
    public void carName(){ // method overloading (for default method calling )
        this.carName = "Audi";
        System.out.println("your car name is " + carName);
    }
    public void carName(String whatIsCarName){
        this.carName = whatIsCarName;
        System.out.println("your car name is " + carName);
    }

}
