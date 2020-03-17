public class test {
    private static final String ERROR_WARNING = "Value Error";  // constant variable

    public static void main(String[] args) {
        System.out.println(GetDuration(140, 8));
        System.out.println(GetDuration(50000));
    }

    public static String GetDuration(long minutes, long seconds) {
        if ((minutes < 0) || ((seconds > 59) || (seconds < 0)))
            return ERROR_WARNING;
        long hours = minutes / 60;
        long remaining_minutes = minutes % 60;
        return String.format("%s%dh %s%dm %s%ds", // ternary operator
                hours < 10 ? "0" : "", hours,
                remaining_minutes < 10 ? "0" : "", remaining_minutes,
                seconds < 10 ? "0" : "", seconds);
    }

    public static String GetDuration(long seconds) {
        if  (seconds < 0)
            return ERROR_WARNING;
        long minutes = seconds / 60;
        long remaining_seconds = seconds % 60;
        return GetDuration(minutes, remaining_seconds);
    }
}
