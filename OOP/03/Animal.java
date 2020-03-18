public class Animal {
    private String name;
    private int age;
    private String breed;
    private int howmuch;



    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }


    // method without  overloading
    public void eat(int howmuchgrams){ // int howmuchgrams is parameter variable
        if((howmuchgrams > 0 ) && (howmuchgrams <500)){
            this.howmuch = (howmuchgrams)/3;
            System.out.println(String.format("your dog eat :%d calories",this.howmuch));
        }else if (howmuchgrams >= 500){
            this.howmuch = (howmuchgrams)/2;
            System.out.println(String.format("your dog eat :%d calories ",this.howmuch));
        }else {
            this.howmuch = howmuchgrams;
            System.out.println("you have entered wrong calaries :" + this.howmuch );
        }
    }

    public void Sence(){
        System.out.println("1.sence method  called in aminal");
    }

    public void call(){
        System.out.println("11.called from super class");
    }


    public String getName() {
        return this.name;
    }



    public int getAge() {
        return this.age;
    }



    public String getBreed() {
        return this.breed;
    }



}
