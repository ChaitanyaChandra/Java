public  class test {
    public static void main(String[] args) {
        //System.out.println(getDurationstring(65,45));
        System.out.println(getDurationstring(3945));


        /* first and second methods are with same name (method overloading )
            First method (two expressions ) and second method (one expressions)
            calling second method
            in second method return statement (two expressions) to the first method
            and Finally first method is executed (with two expressions)
         */
    }

    private static String getDurationstring(long minutes , long seconds) { // called by first method
        if ((minutes < 0) ||(seconds < 0 && seconds > 59)) {
//            String a = "Invalid Value";
//            return a;
            return "Invalid Value";
        }
        long hours = minutes/60;
        long remainingMinutes = minutes % 60;
        return String.format("first method :%dh %dm %ds ",hours,remainingMinutes,seconds);

        //hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }
    private static String getDurationstring(long seconds){
        if (seconds < 0 )
        {
            return "invalid value";
        }
        long minutes = seconds/60;
        long remainingSeconds = seconds % 60;

        return getDurationstring(minutes,remainingSeconds); // this will call the first method  by same name
    }

}
/*
first method :1h 5m 45s
 */