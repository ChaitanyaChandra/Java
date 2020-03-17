public class Account {


    private String name ;
    private int Accnumber;
    private long ballance ;

    // calling with nothing
    public Account(){ // acts as default constructor
        this("noname",000,0); // this calls the another constructor with all parameters
        System.out.println("empty constructor  called");
    }
    public Account(String name,int Accnumber ,long ballance){ // calling with all parameter
        System.out.println("constructor with all parameters called");
        this.name = name;
        this.Accnumber = Accnumber;
        this.ballance = ballance;
    }

    public Account(String name) { // calling with single parameter
        // always (this(passing parameters) ) in fist line when constructor overloading
        this(name,0000,0); // this calls the another constructor with all parameters
        System.out.println("constructor with single parameter called ");
    }

    public void deposit(long Ammountdeposit){
        this.ballance += Ammountdeposit;
        System.out.println(String.format("name :%s , ballance deposited :%d and new ballance :%d"
                ,this.name,this.ballance,this.ballance));
    }

    public void withdraw(long AmmountWithdraw){
        if ((ballance - AmmountWithdraw) < 0){
            System.out.println(String.format("name :%s your withdraw ballance :%d and ballance :%d is low \n*** Cannot Withdraw ***"
                    ,this.name,AmmountWithdraw,this.ballance));
        }else {
            this.ballance -= AmmountWithdraw;
            System.out.println(String.format("name :%s your withdraw :%d and new ballance :%d"
                    ,this.name,AmmountWithdraw,this.ballance));

        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getNumber() {
        return Accnumber;
    }

    public void setNumber(int number) {
        this.Accnumber = number;
    }



    public long getBallance() {
        return ballance;
    }

    public void setBallance(long ballance) {
        this.ballance = ballance;
    }




    public String call(){
        return String.format("name:%s\nballance :%d",
                this.getName(),this.getBallance());
    }

}
