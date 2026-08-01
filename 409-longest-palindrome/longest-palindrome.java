class Solution {
    public int longestPalindrome(String s) {
         HashMap<Character,Integer> c=new HashMap<>();
        int o=0;
        for (char ch:s.toCharArray()) {
            c.put(ch,c.getOrDefault(ch,0)+1);
            if (c.get(ch)%2==1)
                o++;
            else
                o--;
        }
        if (o>1)
            return s.length()-o+1;
        return s.length();
    }
}