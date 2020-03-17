public class test {

    public static void main(String[] args) {
        // write your code here
        int a , b ;
        byte c  , d , t1;
        float k , l , t2;


        c = Byte.MIN_VALUE;
        d = Byte.MAX_VALUE;

        a = Integer.MIN_VALUE;
        b = Integer.MAX_VALUE;


        k = Float.MAX_VALUE;
        l = Float.MIN_VALUE;


        System.out.println("this is min value of Integer\t:"+ a + "\nthis is max value of Integer\t:" + b);

        System.out.println("\nthis is min value of Byte\t:"+ c + "\nthis is max value of Byte\t:" + d);

        System.out.println("\nthis is min value of Float\t:"+ k + "\nthis is max value of Float\t:" + l);
        // string concatenation
//        c = d/2; we will get error even through both are bytes because java automatically  data as int
        t1 = (byte)(d/2);
        t2 = (k/2);
        System.out.println("\nby using type casting\t:" + t1);
        System.out.println("\nwithout using type casting\t:"+t2);
        k = 1.5F; // Float is represented with F and f
        l = (float)15.5; // float values default have double until represent float
        //  l = 15.5; wrong way of assigning float because its an double(default)
    }
}
/* OutPut
this is min value of Integer	:-2147483648
this is max value of Integer	:2147483647

this is min value of Byte	:-128
this is max value of Byte	:127

this is min value of Float	:3.4028235E38
this is max value of Float	:1.4E-45

by using type casting	:63

without using type casting	:1.7014117E38
 */