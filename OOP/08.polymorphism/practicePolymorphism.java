public class Main{
    public static void main(String[] args) {
        for (int a  = 1 ; a <= 10 ; a++){
            Movie test = call();
            System.out.println(String.format("loop number:%d ",a));
            test.getHeroNameAndMovieName();

        }

    }
    public static Movie call(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("\nnumber generated = " + randomNumber );
        switch (randomNumber){
            case 1:
                return new Bahubali();
            case 2:
                return new ishq();
            case 3:
                return new war();
            case 4:
                return new one();
            case 5:
                return new tv9();
            default:
                return new Movie("no movie");
        }
    }
}
class Movie{
    private String movieName;
    public Movie(String whatIsMovieName){
        this.movieName = whatIsMovieName;
    }
    public String getHeroName(){
        return "no name";
    }

    public String getMovieName() {
        return movieName;
    }
    public void getHeroNameAndMovieName(){
        System.out.println(String.format("hero name:%s \nmovie name:%s",getHeroName(),getMovieName()));
    }
}

class Bahubali extends Movie {
    public Bahubali(){
        super("bahubali 1");
    }

    public String getHeroName() {
        return "prabhas";
    }

    public void getHeroNameAndMovieName() {
        super.getHeroNameAndMovieName();
    }
}


class ishq extends Movie {
    public ishq(){
        super("ishq 2");
    }
    public String getMovieName() {
        return "Nithin";
    }

    public void getHeroNameAndMovieName() {
        super.getHeroNameAndMovieName();
    }
}


class war extends Movie {
    public war(){
        super("war 3");
    }

    public void getHeroNameAndMovieName() {
        super.getHeroNameAndMovieName();
    }
}




class one extends Movie {
    public one(){
        super("one 4");
    }

    @Override
    public String getHeroName() {
        return "mahesh Babu";
    }

    public void getHeroNameAndMovieName() {
        super.getHeroNameAndMovieName();
    }
}



class tv9 extends Movie {
    public tv9(){
        super("tv9 5");
    }

    @Override
    public String getHeroName() {
        return "tv9 ancher";
    }

    public void getHeroNameAndMovieName() {
        super.getHeroNameAndMovieName();
    }
}
/*
number generated = 3
loop number:1
hero name:no name
movie name:war 3

number generated = 5
loop number:2
hero name:tv9 ancher
movie name:tv9 5

number generated = 1
loop number:3
hero name:prabhas
movie name:bahubali 1

number generated = 2
loop number:4
hero name:no name
movie name:Nithin

number generated = 1
loop number:5
hero name:prabhas
movie name:bahubali 1

number generated = 1
loop number:6
hero name:prabhas
movie name:bahubali 1

number generated = 4
loop number:7
hero name:mahesh Babu
movie name:one 4

number generated = 3
loop number:8
hero name:no name
movie name:war 3

number generated = 5
loop number:9
hero name:tv9 ancher
movie name:tv9 5

number generated = 5
loop number:10
hero name:tv9 ancher
movie name:tv9 5
*/
