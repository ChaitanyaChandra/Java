// even or odd with method parameters using while loop
public class test{
    public static void main(String[] args) {
        int from = 50;
        int to = 60;
        find(from,to);
    }

    public static void find(int a , int b ) {
        while (a <= b) {
            System.out.println(String.format(" %d is %s",a,a % 2 == 0 ? "even" : "odd"));
            a++;
        }
    }

}
/*
 50 is even
 51 is odd
 52 is even
 53 is odd
 54 is even
 55 is odd
 56 is even
 57 is odd
 58 is even
 59 is odd
 60 is even
 */
