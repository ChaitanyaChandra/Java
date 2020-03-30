// composition
public class Logo {

    // declaring variable
    private String logoname;

    // constructor
    public Logo(String logoname) {
        this.logoname = logoname;
    }

    // getter
    public String getLogoname() {
        return logoname;
    }

    // public method to call from main class with composition setter
    public void Status(String screenStatus){
        if (screenStatus == "on"){
            System.out.println("logo:green");
        }else {
            System.out.println("logo:red");
        }
    }

}
