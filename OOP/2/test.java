public class test{
    public static void main(String[] args) {
        Account one = new Account("chaitanya");
        one.deposit(10000);
        one.deposit(5000);
        one.withdraw(10000);
    }
}
/*
constructor with all parameters called
constructor with single parameter called
name :chaitanya , ballance deposited :10000 and new ballance :10000
name :chaitanya , ballance deposited :15000 and new ballance :15000
name :chaitanya your withdraw :10000 and new ballance :5000
 */