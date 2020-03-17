public  class test {
    public static void main(String[] args) {

        int accessingReturn =totaling(1,2); // calling a method is known as method overloading
        System.out.println(accessingReturn * 3);
    }


    public static int totaling(int a ,int b ) {
        int total = a + b;  // total local variable
        System.out.println(String.format("this is total %d",total));
        return  total*3 ; // data stored in the total variable and called by accessing the method (variable)
    }

}