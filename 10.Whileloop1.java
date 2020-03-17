public class test{
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 10 ) {
            sum += a;
            System.out.println(String.format("%s%d",a < 10 ? "0":"",a));
            a++;
        }
        System.out.println(String.format("*** Sum:%d ***",sum));

        int i = 10;
        int sumA = 0;
        do {
            sumA += i;
            System.out.println(String.format("%s%d",i < 10 ? "0":"",i));
            --i;
        }
        while (i >= 1 );
        System.out.println(String.format("*** Sum:%d ***",sumA));

    }
}