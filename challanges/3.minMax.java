import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 2147483647; //int max number in min
        int  max = -2147483648; // int min number in max Integer.MinValue;
//        boolean apple = true; 2nd method using boolean (min and max = 0)
        int loop = 0;
        while (true) {
            loop += 1;
            System.out.println(String.format("%d> enter digit to find min and max current min :%d and max :%d", loop, min, max));
            boolean nextDigitInt = input.hasNextInt();
            if (nextDigitInt){
                int  digit = input.nextInt();
//                if (apple){
//                    apple = false;
//                    min = digit;
//                    max = digit;
//                }
                if (digit > max  ){
                    max = digit;
                }else if (digit < min){
                    min = digit;
                }
            } else{
                System.out.println("invalid digit ");
                System.out.println(String.format("min:%d max:%d",min,max));
                break;
            }
        }

    }
}
/* using boolean
1> enter digit to find min and max current min :0 and max :0
10
2> enter digit to find min and max current min :10 and max :10
5
3> enter digit to find min and max current min :5 and max :10
50
4> enter digit to find min and max current min :5 and max :50
,
invalid digit
min:5 max:50
 */

/* using min and max value of integer
1> enter digit to find min and max current min :2147483647 and max :-2147483648
5000  // store only one variable
2> enter digit to find min and max current min :2147483647 and max :5000
6000
3> enter digit to find min and max current min :2147483647 and max :6000
5
4> enter digit to find min and max current min :5 and max :6000
df
invalid digit
min:5 max:6000
 */