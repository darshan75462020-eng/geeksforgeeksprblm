public class Score_of {
    public static void main (String[] args)
    {
        Score_of sc = new Score_of();
        String s="code";
        System.out.println(sc.scoreOfString(s));
    }
    public int scoreOfString(String s) {
        char ch[] =s.toCharArray();
        int score =0;
        for(int i=1;i<s.length();i++)
        {
            score=score+Math.abs(ch[i]-ch[i-1]);
        }
        return score;
    }
}


