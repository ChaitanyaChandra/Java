public class test {
    public static void main(String[] args) {


        int z;
        z = 1;
        while (z <= 5) // error comes with in the operator (<>)
        {

            System.out.println(String.format("%d>this is while loop ", z));
            ++z;
        }

        System.out.println("\n**********************************************\n");

        int i;
        i = 1;
        do
        {
            System.out.println(String.format("%d>this is dowhile loop",i));
            ++i;
        }
        while (i <= 5);

    }
}
/*
1>this is while loop
2>this is while loop
3>this is while loop
4>this is while loop
5>this is while loop

**********************************************

1>this is dowhile loop
2>this is dowhile loop
3>this is dowhile loop
4>this is dowhile loop
5>this is dowhile loop
 */