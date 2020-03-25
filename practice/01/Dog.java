public class Dog extends Animal{
    private int tailSpeed;


    public Dog(String WhatisAnimalName , String WhatIsAnimalBreed,int tailSpeed) { // subclass (child class) constructor with three parameters
        super(WhatisAnimalName, WhatIsAnimalBreed);
        this.tailSpeed = tailSpeed;
    }

    public Dog() { // subclass (child class) constructor with no parameters
        this("dog","lab",10);
    }


    @Override // method override
    public void run(float moveSpeedPerMinute_in_meters){
        super.run(moveSpeedPerMinute_in_meters);
    }

    @Override // method override
    public void walk(float moveSpeedPerMinute_in_meters) {
        super.walk(moveSpeedPerMinute_in_meters);
    }







    public int gettailSpeed(){
        return tailSpeed;
    }


}