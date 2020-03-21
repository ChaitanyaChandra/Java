public class tv extends house {
    private String Screen;

    // default constructor for child class
    public tv(){
        this("tv","screen");
    }



    // using child name in constructor method  of child
    public tv(String name_of_items_in_house , String Components) {
        super(name_of_items_in_house); // super()  is used to call parent class constructor (variables and methods)
        this.Screen = Components; // this is used to call in child class (variables and methods)
    }

    @Override
    public void Status(String WhatIsStatus){
        super.Status(WhatIsStatus); // super() refers constructor in parent class
        // super.a() refers method in parent class
      //  Status(WhatIsStatus);this will return to the this method so   dont use this it will run until the memory goes 0
    }

    // method for calling
    public void call(){
        System.out.println(String.format("items:%s Components:%s Status:%s",
                super.getName_of_items(),this.Screen,super.getCallStatus() ));

    }

}
