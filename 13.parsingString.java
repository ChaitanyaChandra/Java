public class test {
    public static void main(String[] args) {
        String a;
        a = "2019";
        int b = Integer.parseInt(a);
        float c = Float.parseFloat(a);
        a += 1;
        b += 1;
        c += 1;
        System.out.println(String.format("without parse :%s",a));
        System.out.println(String.format("with parse int  :%d",b));
        System.out.println(String.format("with parse float :%.2f",c));
    }
}
/*
without parse :20191
with parse int  :2020
with parse float :2020.00
 */