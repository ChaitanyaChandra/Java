public class Parts extends  Vehicale {
    private String material;
    private String quality;

    // default constructor
    public Parts(){
        this("door","steel","Andhra Steel","A Grade");
    }

    // using constructor from parent class and using as local class
    public Parts(String whatIsNameOfPart , String whatIsKindOfpart,String whatIsMaterial,String whatIsQuality){
        super("door","steel"); // super() call is used to  call from child class constructor to parent class constructor
        this.material = whatIsMaterial;
        this.quality = whatIsQuality;
    }

    @Override
    public void carName(){
        super.carName(); // super. (method or variable) is used to call variable or method
    }
    @Override
    public void carName(String whatIsNameOfCar){
        super.carName(whatIsNameOfCar); // super. (method or variable) is used to call variable or method
    }


}
