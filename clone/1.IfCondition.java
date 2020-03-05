public class test {
    public static void main(String[] args) {
        String a, b, c;
        a = "chaitanya ";
        b = "chowdary";
        if (a == "chaitu " && b == "chowdary") // if condition (expression)
            System.out.println("this is chaitu chowdary"); // statement
        else if (a == "chaitanya " && b == "chowdary") // use codeblock for morethan one statement 
            System.out.println("this is chaitanya chowdary");
        else if (a == "chaitu " || b == "chowdary")
            System.out.println("this is  chowdary");
        else
            System.out.println("this is not chaianya");

    }
}
//this is chowdary