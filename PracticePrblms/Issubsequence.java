public class Issubsequence {
    public static void main(String[] args) {
        Issubsequence is = new Issubsequence();
        String s="axc";
        String t="ahbdec";
        System.out.println(is.isSubsequence(s,t));
    }
     public boolean isSubsequence(String s, String t) {
      
      int i=0;
      int j=0;
      while(i<s.length()&&j<t.length())
      {
        if(s.charAt(i)==t.charAt(j)) {
           
            i++;         
      }
      j++;
    }
    return i==s.length();
}
}
