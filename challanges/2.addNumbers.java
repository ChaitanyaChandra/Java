import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loop = 1;
        long add = 0;
        while (loop <= 10){
            System.out.println(String.format("%d> enter the digit to add %d+",loop,add));
            boolean nextScanInt = input.hasNextInt();
            if (nextScanInt){
                long b = input.nextInt();
                add += b;
//                input.nextLine(); // space handling for next int (only for immediate action )
                loop++;
            }else {
                System.out.println("not valid input");
                break;
            }
        }
        System.out.println(String.format("total value is :%d",add));
        return;
    }
}
/*
1> enter the digit to add 0+
10
2> enter the digit to add 10+
20
3> enter the digit to add 30+
10
4> enter the digit to add 40+
20
5> enter the digit to add 60+
70
6> enter the digit to add 130+
50
7> enter the digit to add 180+
60
8> enter the digit to add 240+
40
9> enter the digit to add 280+
10
10> enter the digit to add 290+
10
total value is :300
 */