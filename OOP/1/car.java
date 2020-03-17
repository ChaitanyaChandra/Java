public class car {
    // public or private  is a access modifier
    // class is a blueprint or template for creating a objects
    // name conventions using capitals (Car) in the name
    private String color;
    private String seats;


    // (string color) is a parameter passed to the method
    public void setColor(String color){
        // returns nothing (void)
        String validcolor = color.toLowerCase();
        if (validcolor.equals("green") || validcolor.equals("black")){
            //.equals is comparing objects
            this.color = color.toLowerCase();
        }else {
            this.color = "unknown";
        }
    }
    public String getColor(){ // calling a method
        // returns something
        return this.color;
    }

}