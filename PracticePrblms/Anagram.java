public class Anagram {
        public static void main (String[] args)
        {
            Anagram an = new Anagram();
            String s="racecar";
            String t="carrace";
            System.out.println(an.isAnagram(s,t));
        }
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
       int freq[]=new int[26];
       
       for(int i=0;i<s.length();i++)
       {
        freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;
       }
       for(int num:freq)
       {
        if(num!=0) return false;
       }
       return true;
    }
}


