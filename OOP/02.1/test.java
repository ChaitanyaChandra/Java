//constructor overloading
public class test{
    public static void main(String[] args) {
        VipCustomer one = new VipCustomer();
        VipCustomer two = new VipCustomer("chaitu",80808080.00);
        VipCustomer three = new VipCustomer("chaitanya",1000000.00,"chaituchowdary@outlook.in");
        System.out.println(one.getName());
        System.out.println(two.getName());
        System.out.println(three.getName() + " "+ three.getEmail());
    }
}
/*
name:noname ,credit limit :50000.00 ,email: go@gmail.com
name:chaitu ,credit limit :80808080.00 ,email: go@gmail.com
name:chaitanya ,credit limit :1000000.00 ,email: chaituchowdary@outlook.in
noname
chaitu
chaitanya chaituchowdary@outlook.in
 */