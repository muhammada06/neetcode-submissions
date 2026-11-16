class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }

        HashMap <Character, Integer> sWords=new HashMap<>();
        HashMap <Character, Integer> tWords=new HashMap<>();

        for (int x=0;x<s.length();x++){
            sWords.put(s.charAt(x),sWords.getOrDefault(s.charAt(x),0)+1);
            tWords.put(t.charAt(x),tWords.getOrDefault(t.charAt(x),0)+1);
        }

        return sWords.equals(tWords);

    }
}
