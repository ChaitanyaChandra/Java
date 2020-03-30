// child class
//inheritance
public class Screen extends Mobile{

    // declaring composition
    private Logo printLogoInScreen;
    private Resolution resolutionInScreen;

    //inheritance composition  constructor
    public Screen(String name, Logo printLogoInScreen, Resolution resolutionInScreen) {
        super(name);
        this.printLogoInScreen = printLogoInScreen;
        this.resolutionInScreen = resolutionInScreen;
    }

    // getter
    public Logo getPrintLogoInScreen() {
        return printLogoInScreen;
    }

    //getter
    public Resolution getResolutionInScreen() {
        return resolutionInScreen;
    }


    // public method to call from main class with composition setter
    public void Status(String screenStatus){
        if (screenStatus == "on"){
            System.out.println("powered by android \nloading....");
        }else {
            System.out.println("Switched off");
        }
    }

}
