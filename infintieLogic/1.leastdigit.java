public class test{
    public static void main(String[] args) {
        System.out.println(addLeastDigit(9999));

    }
    private static int addLeastDigit(int a){
        if (a< 10 ){
            return -1;
        }
        //125/10 = 12  12*10 = 120 125-120 = 5
        int sum = 0;
        while (a > 0) {
            int digit = a % 10;
            sum += digit;
            a /= 10;
        }
        return sum;

    }
}
