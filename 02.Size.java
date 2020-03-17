public class test {

    public static void main(String[] args) {
        // write your code here
        int a , b ,trail; //store value form  0 to (+-)2147483648 ( (+-)2147483647)
        byte c  , d; //store value  0 to (+-)128 ((+-)127)
        short e , f; //store value  0 to (+-)32768((+-)32767)
        long g , h ; // store value 0 to (+-)9223372036854775808 ((+-)9223372036854775807)
        double i ,j;
        float k , l;
        char m , n ;
        boolean o , p ;
        String q , r;  // string is immutable  (new object is created when we edit the string )


        // byte occupies 8 bits
        // short occupies 16 bits
        // char occupies 16 bits
        // int occupies 32 bits
        // float occupies 32 bits
        // double occupies 64 bits
        // long occupies 64 bits


        m = '\u00A9';
        System.out.println("\n"+ m + "All Rights received chaitanya Industries\n");

        o = true;
        p = false;

        System.out.println("this is true :" + o );
        System.out.println("this is false :" + p + "\n");

        q = "this is chaitanya chowdary ";
        r = "and i am the  king of seven kingdoms with three dragons!\n";

        System.out.println(q+r);


        // trail = 2147483648;
        // when it was increased by one digit it will shows error



        c = Byte.MIN_VALUE;
        d = Byte.MAX_VALUE;

        e = Short.MIN_VALUE;
        f = Short.MAX_VALUE;

        a = Integer.MIN_VALUE;
        b = Integer.MAX_VALUE;

//        g = 100L; // L or l to represent long datatype
//        h = 100l; // without l the long treats as Int

        g = Long.MAX_VALUE;
        h = Long.MIN_VALUE;

        i = Double.MAX_VALUE;
        j = Double.MIN_VALUE;


        k = Float.MAX_VALUE;
        l = Float.MIN_VALUE;


        System.out.println("this is min value of Integer\t:"+ a + "\nthis is max value of Integer\t:" + b);

        System.out.println("\nthis is min value of Byte\t:"+ c + "\nthis is max value of Byte\t:" + d);

        System.out.println("\nthis is min value of Short\t:"+ e + "\nthis is max value of Short\t:" + f);

        System.out.println("\nthis is min value of Long\t:"+ g + "\nthis is max value of Long\t:" + h);

        System.out.println("\nthis is min value of Double\t:"+ i + "\nthis is max value of Double\t:" + j);

        System.out.println("\nthis is min value of Float\t:"+ k + "\nthis is max value of Float\t:" + l);
        // string concatenation

    }
}
/* OutPut
©All Rights received chaitanya Industries

this is true :true
this is false :false

this is chaitanya chowdary and i am the  king of seven kingdoms with three dragons!

this is min value of Integer	:-2147483648
this is max value of Integer	:2147483647

this is min value of Byte	:-128
this is max value of Byte	:127

this is min value of Short	:-32768
this is max value of Short	:32767

this is min value of Long	:9223372036854775807
this is max value of Long	:-9223372036854775808

this is min value of Double	:1.7976931348623157E308
this is max value of Double	:4.9E-324

this is min value of Float	:3.4028235E38
this is max value of Float	:1.4E-45

*/