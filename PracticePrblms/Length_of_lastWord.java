public class Length_of_lastWord {
    public static void main(String[] args) {
        Length_of_lastWord lw = new Length_of_lastWord();
        String s="Hello World";
        System.out.println(lw.lengthOfLastWord(s));
    }
    
     public int lengthOfLastWord(String s) {
       int count=0;
       int i=s.length()-1;
       while(i>=0 && s.charAt(i)==' ')
       {
        i--;
       }

       while(i>=0 && s.charAt(i)!=' ')
       {
        count++;
        i--;
       }
       return count;
    }
}
