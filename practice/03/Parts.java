public class Parts extends Vehicale{
    private String partName;

    public Parts(String name , String status , String whatIsNameOfPart){
        super("Audi","good");
        this.partName = whatIsNameOfPart;
    }

    public Parts(){
        super("Audi","good");
        this.partName = "glass";
    }


    @Override
    public void Status(String StatusofVehicale){
        super.Status(StatusofVehicale);
    }

    @Override
    public void Status(){
        super.Status();
    }
}