// Main class
public class Main {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 10 ; i++ ){
            Movie test = randommovie();
            System.out.println(
                    String.format("loop no:%d \n%s\n%s\n",i,test.getName(),test.GetHeroName()
                    ));

        }
    }
    // composition method
    public static Movie randommovie(){
        int randomNumber =(int) (Math.random() * 6) +1;
        System.out.println("randomNumber generated = " + randomNumber);
        switch (randomNumber){
            case 1:
                return new GOT();
            case 2:
                return new Saho();
            case 3:
                return new Rebal();
            case 4:
                return new Manam();
            case 5:
                return new Jalsa();
            default:
                return new Movie("nothing");
        }

    }

}

// parent class
class Movie{
    // declaring a variable
    private String name ;
    // constructor with variables
    public Movie(String theName){
        this.name = theName ;
    }
    // public method for overloading(polymorphism) and overriding (polymorphism)
    public String GetHeroName() {
        return "no name";
    }

    //getter
    public String getName() {
        return this.name;
    }
}


// inheritance
class GOT extends Movie {
    // default constructor
    public GOT() {
        super("Game Of Thrones");
    }
    //method overloading with polymorphism
    public String GetHeroName() {
        return "king edward";
    }
}


// inheritance
class Saho extends Movie {
    //default constructor
    public Saho(){
        super("Saho telugu hindi english");
    }
    //method overloading with polymorphism
    public String GetHeroName() {
        return "Bahubali prabhas";
    }
}


//inheritance
class Rebal extends Movie {
    //default constructor
    public Rebal(){
        super("prabas");
    }
}



//inheritance
class Manam extends Movie {
    //default constructor
    public Manam() {
        super("manam movie");
    }
    //method overriding with polymorphism
    @Override
    public String GetHeroName() {
        {
            return "Nagarguna";
        }
    }
}



//inheritance
class Jalsa extends Movie {
    //default constructor
    public Jalsa() {
        super("Jalsa Movie");
    }
    // method overriding with polymorphism
    @Override
    public String GetHeroName() {
        return "pawan kalyan";
    }
}
/*
randomNumber generated = 2
loop no:1
Saho telugu hindi english
Bahubali prabhas

randomNumber generated = 3
loop no:2
prabas
no name

randomNumber generated = 1
loop no:3
Game Of Thrones
king edward

randomNumber generated = 2
loop no:4
Saho telugu hindi english
Bahubali prabhas

randomNumber generated = 1
loop no:5
Game Of Thrones
king edward

randomNumber generated = 5
loop no:6
Jalsa Movie
pawan kalyan

randomNumber generated = 6
loop no:7
nothing
no name

randomNumber generated = 6
loop no:8
nothing
no name

randomNumber generated = 5
loop no:9
Jalsa Movie
pawan kalyan

randomNumber generated = 5
loop no:10
Jalsa Movie
pawan kalyan

 */
