import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Dob;
        String name;
        System.out.println("enter your Date of Birth :");
        Boolean checkIntNextLine = input.hasNextInt(); // next Scan must be int
        if (checkIntNextLine) { // to compare boolean value true
            Dob = input.nextInt();
            input.nextLine(); // space handling for next int
            System.out.println("enter your name :");
            name = input.nextLine();
            int age = 2020 - Dob;
            if (age >= 0 && age <= 100) {
                System.out.println(String.format("your  name is %s and age is %d ", name, age));
            } else
                System.out.println("not valid Date of Birth ");
        }else {
            System.out.println("not valid Date of birth");
            return ;
        }
        input.close(); // close the Scanner
    }
}