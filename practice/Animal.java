public class Animal{
    private String name;
    private String  breed;



    public Animal(){ // superclass (parent class) constructor with no parameters
        this("GermanShapardDog","GermanShapard"); // this refer to the main constructor
    }

    public Animal(String WhatisAnimalName){ // superclass (parent class) constructor with one parameters
        this("dog","bad");
        this.name = WhatisAnimalName;


    }
    public Animal(String WhatisAnimalName , String WhatIsAnimalBreed){ // superclass (parent class) constructor with all parameters
        this.name = WhatisAnimalName;
        this.breed = WhatIsAnimalBreed;
        System.out.println(String.format("name:%s and breed :%s",WhatIsAnimalBreed,WhatIsAnimalBreed));
    }



    public void run(float moveSpeed){ //method for overriding
        System.out.println(String.format("1.animal run at speed :%.2fkph",((moveSpeed)/100)*2.4));
    }

    public void walk(float moveSpeed){ // method for overriding
        System.out.println(String.format("1.animal walk at speed :%.2fkph",((moveSpeed)/100)*1.2));
    }



    public String getName(){ // getting a part of encapsulation
        return this.name;
    }


    public String getBreed(){ // getting a part of encapsulation
        return this.breed;
    }

}
