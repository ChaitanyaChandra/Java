/ continue and break are loop interrupters
// continue keyword the loop will bypass the part of code block that is below the continue keyword and continue with the next iteration
// break keyword exit the loop
public class test{
    public static void main(String[] args) {
        int a = 0;
        while (a < 15){
            a++;
            if (a <= 5) {
                System.out.println(String.format("skipp this loop at %d", a));
                continue; // continue run from starting (i.e while loop) and continue will not run the below code
            }
            System.out.println(a);
            if (a >= 10){ // no Semicolon
                System.out.println(String.format("breaking the loop  at  %d",a));
                break; // loop ends here
            }
        }


    }
}
/*
skipp this loop at 1
skipp this loop at 2
skipp this loop at 3
skipp this loop at 4
skipp this loop at 5
6
7
8
9
10
breaking the loop  at  10
 */