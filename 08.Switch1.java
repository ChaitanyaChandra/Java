public class test {
    public static void main(String[] args) {
        int a = 5;
        switch (a){
            case 1:
                System.out.println("value equal to one ");
                break;
            case 2:
                System.out.println("this is not equal to one ");
            case 3: case 4: case 5:
                System.out.println("this is 3 , 4 , 5 ");
                System.out.println(String.format("this is a actual number :%d",a));
                break;
            default:
                System.out.println("it's ok ");
        }

    }
}
/*
this is 3 , 4 , 5
this is a actual number :5
 */