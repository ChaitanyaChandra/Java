public class test{
    public static void main(String[] args)
    {

        int a , b, c;
        boolean gameover = true;
        a = 10;
        b = 20;
        c = 30;
        int  h = addition(gameover,a, b, c ); // method is called first and  variable is called in second
        System.out.println("this is your final score stored in a variable :" + h);

    }

    // float returns float  , int returns int  , ...........
    public static int   addition(boolean gameover , int a, int b,int c )
    {
        if (gameover)
        {
            int i  =  c +  a   + b;
            System.out.println("your final score is :" + i);
            int f = i;
            return f;
        } // void returns nothing  (dont returns anything)
        else
            System.out.println("false statement");
        return -1; // float  or int ....     double returns something
    }

}

