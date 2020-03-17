public class VipCustomer {


    private String name ;
    private double credit_limit ;
    private String email ;

    public VipCustomer(){
        this("noname",50000.00,"go@gmail.com");
    }
    public VipCustomer(String name,double credit_limit){
        this(name,credit_limit,"go@gmail.com");
    }
    public VipCustomer(String name ,double credit_limit,String email){
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
        System.out.println(String.format("name:%s ,credit limit :%.2f ,email: %s",
                this.name,this.credit_limit,this.email));
    }


    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }

}
