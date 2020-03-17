public class test{
    public static void main(String[] args) {

        int a , b , c , largest , smallest;
        a = 10;
        b = 20;
        c = 30;

        smallest = a < b ?  (a < c ? a : c ) : (b < c ? b : c);

        largest = a > b ? (a > c ? a : c) : ( b > c ? b : c);  //    if ? than : else

        System.out.println("this is largst number found with ternary Operator " + largest);
        System.out.println("this is smallest  number found with ternary Operator " + smallest);

    }
}
/*
this is largst number found with ternary Operator 30
this is largst number found with ternary Operator 10
 */