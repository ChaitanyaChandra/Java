public class test{
    public static void main(String[] args)
    {
        int HighScorePosition = CalcualteHighScorePosition(1500);
        DisplayHighScorePosition("chandra",HighScorePosition);

        HighScorePosition = CalcualteHighScorePosition(900);
        DisplayHighScorePosition("Chaitanya",HighScorePosition);

        HighScorePosition = CalcualteHighScorePosition(400);
        DisplayHighScorePosition("chowdary",HighScorePosition);

        HighScorePosition = CalcualteHighScorePosition(50);
        DisplayHighScorePosition("Chaitu",HighScorePosition);

        HighScorePosition = CalcualteHighScorePosition(800);
        DisplayHighScorePosition("ChaituChowdary",HighScorePosition);
    }
    public static void DisplayHighScorePosition(String Name ,int HighScorePosition)
    {
        System.out.println(String.format("%s managed to get into position %d%s on high score table "
                , Name , HighScorePosition, HighScorePosition == 1 ? "st" : HighScorePosition == 2 ? "nd" : HighScorePosition == 3 ? "rd" : "th"));
    }  // ternary operator
    public static int CalcualteHighScorePosition(int PlayerScore)
    {
        if (PlayerScore > 1000 )
            return 1;
        else if (PlayerScore > 500 && PlayerScore < 1000)
            return 2;
        else  if (PlayerScore > 100 && PlayerScore < 500)
            return 3;
        return 4;
    }

}
/*
chandra managed to get into position 1st on high score table
Chaitanya managed to get into position 2nd on high score table
chowdary managed to get into position 3rd on high score table
Chaitu managed to get into position 4th on high score table
ChaituChowdary managed to get into position 2nd on high score table
 */