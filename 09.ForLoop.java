public class test{
    public static void main(String[] args) {
        // initialize variable ; check condition; iteration step;
        for (int a = 0; a <= 15 ; a++)
            if (a == 0) // for loop starts with initialize number (until if condition )
                System.out.println(String.format("this is not a valid number %d",a));
            else if (a % 2 == 0) // % is remainder (modulo)
                System.out.println(String.format("%d is %s ",a,a == 4  ? "not a good sign ": "even number")); //ternary operator
            else
                System.out.println(String.format("%d is %s",a, a == 13 ? "not a good sign " : "odd number" ));

    }
}
/*
this is not a valid number 0
1 is odd number
2 is even number
3 is odd number
4 is not a good sign
5 is odd number
6 is even number
7 is odd number
8 is even number
9 is odd number
10 is even number
11 is odd number
12 is even number
13 is not a good sign
14 is even number
15 is odd number
 */