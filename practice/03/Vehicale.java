public class Vehicale{
    // declaring
    private String name ;
    private String status;



    // constructor
    public Vehicale(String whatIsVehicaleName ,String whatIsStatus){
        this.name = whatIsVehicaleName;
        this.status = whatIsStatus;
    }
    public Vehicale(){ // default constructor
        this.name = "Audi";
        this.status = "Good";
    }




    // setting
    public void setName(String whatIsVehicaleName){
        this.name = whatIsVehicaleName;
    }
    // getting
    public String getName(){
        return this.name;
    }

    public String getStatus() {
        return status;
    }

    //method for overriding
    public void Status(String StatusofVehicale){
        this.status = StatusofVehicale;
    }

    //overloading method for overloading
    public void Status(){
        this.status = "good";
    }
}