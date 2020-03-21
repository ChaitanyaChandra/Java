public class house{

    // declaring private variable
    private String name_of_items;
    private String State;

    // default (empty) constructor
    public house(){
        this("tv"); // this() call is used in constructor method (individually) to pass parameters
    }

    // constructor
    public house(String name_of_items_in_house){
        this.name_of_items = name_of_items_in_house; // this.a is used to assign the value to a (individually)
    }


    // setter
    public void setName_of_items(String name_of_items_in_house){
        this.name_of_items = name_of_items_in_house;
    }


    // getter
    public String getName_of_items(){
        return this.name_of_items;
    }


    // method for overriding
    public void Status(String WhatIsStatus){
        this.State = WhatIsStatus;
    }

    // getting statement for overriding
    public String getCallStatus(){
        return this.State;
    }
}


