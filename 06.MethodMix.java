public class test // using multiple methods
{
    public static void main(String[] args)
    {
        Double a = DisplayAverage(5.0,5.0,5.0); // storing in  a variable
        char b = DisplayGrade(a);
        DisplayAll("chandra", a , b );


        a = DisplayAverage(15.4,20.2,25.1); // already declared
        b = DisplayGrade(a);
        DisplayAll("chaitanya", a , b );

        a = DisplayAverage(47.0,48.0,45.0);
        b = DisplayGrade(a);
        DisplayAll("chaitu", a , b );


        a = DisplayAverage(30,32.0,30.0);
        b = DisplayGrade(a);
        DisplayAll("ChaituChowdary", a , b );



    }
    public static double DisplayAverage(double telugu ,double hindi ,double english)
    {
        double average; // local variable no need to declare in outside
        average = (telugu + hindi + english)/3;
        return average;
    }
    public static  char DisplayGrade(double GradingAverage)
    {
        char grade = 'D'; // returns here
        if (GradingAverage >= 40)
            grade = 'A';
        else if (GradingAverage >= 30)
            grade = 'B';
        else if (GradingAverage >= 20)
            grade = 'C';
        return grade; //returns grade variable char
    }
    public static void DisplayAll(String name , Double average , char grade )
    {
        System.out.println(String.format("this is %s with average marks %.2f and grade %c",name ,average,grade));
    }
}
/*
this is chandra with average marks 5.00 and grade D
this is chaitanya with average marks 20.23 and grade C
this is chaitu with average marks 46.67 and grade A
this is ChaituChowdary with average marks 30.67 and grade B
 */