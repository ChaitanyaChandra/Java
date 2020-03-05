public class test {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; ++i)
            System.out.println(String.format("%d>this is for loop",i));

        System.out.println("\n**********************************************\n");

        for (int a = 5 ; a > 0 ; --a)
            System.out.println(String.format("you have only %d chanc%s. ok!", a ,a == 1 ? "e" : "es"));

        System.out.println("\n**********************************************\n");

        for (int a = 1 , b = 5 ; a <= 5 && b >= 0 ; ++a, --b )
        {

            System.out.println(String.format("%d> chandra you have only %d chanc%s" , a , b , b  == 1 ? "e" : "es"));
        } // ternary operator
    }
}
/*
1>this is for loop
2>this is for loop
3>this is for loop
4>this is for loop
5>this is for loop

**********************************************

you have only 5 chances. ok!
you have only 4 chances. ok!
you have only 3 chances. ok!
you have only 2 chances. ok!
you have only 1 chance. ok!

**********************************************

1> chandra you have only 5 chances
2> chandra you have only 4 chances
3> chandra you have only 3 chances
4> chandra you have only 2 chances
5> chandra you have only 1 chance
 */