// composition
public class Resolution {
    // declaring variable
    private String Resolution;


    // constructor
    public Resolution(String resolution) {
        Resolution = resolution;
    }

    // getter
    public String getResolution() {
        return Resolution;
    }

    // public method to call from main class with composition setter
    public void Status(String screenStatus){
        if (screenStatus == "on"){
            System.out.println("1920X1080");
        }else {
            System.out.println("null(-1)");
        }
    }

}
