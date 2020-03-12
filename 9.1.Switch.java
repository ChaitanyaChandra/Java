public class test {
    public static void main(String[] args) {
        findlower("Chaitanya");
        findupper("chaitanya");
    }

    public static void findlower(String call) {
        switch (call.toLowerCase()){ // to lower case and to upper case was only used in strings not in char
            case "chaitanya":case "chaitu":case "chaituchowdary":case "chandra":
                System.out.println(call + " was found");
                break;
            default:
                System.out.println(call + " was not found ");
                break;
        }
    }
    public static void findupper(String call) {
        switch (call.toUpperCase()){
            case "CHAITANYA":case "CHAITU":case "CHAITUCHOWDARY":case "CHANDRA":
                System.out.println(call + " was found");
                break;
            default:
                System.out.println(call + "was not found ");
                break;

        }
    }
}
/*
Chaitanya was found
chaitanya was found
 */