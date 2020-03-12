import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int loop = 1;
        long sum = 0;
        int count = 0;
        while (true){
            count += loop;
            System.out.println(String.format("%d> enter the digit %d+:",count,sum));
            boolean nestIsInt = input.hasNextInt();
            if (nestIsInt){
                long add = input.nextInt();
                sum += add;
                if (count >= 10){
                    System.out.println(String.format("total :%d",sum));
                    System.out.println("*** it\'s over ***");
                    break;
                }
            }else {
                System.out.println("invalid intiger !");
                if (count >= 10){
                    System.out.println(String.format("total :%d",sum));
                    System.out.println("*** it\'s over ***");
                    break;
                }
            }
            input.nextLine();
        }
    }
}
/*
1> enter the digit 0+:
10
2> enter the digit 10+:
10
3> enter the digit 20+:
10
4> enter the digit 30+:
10
5> enter the digit 40+:
;
invalid intiger !
6> enter the digit 40+:
10
7> enter the digit 50+:
10
8> enter the digit 60+:
k1
invalid intiger !
9> enter the digit 60+:
10
10> enter the digit 70+:
1k
invalid intiger !
total :70
*** it's over **
 */