class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        Map<Character, Integer> letters = new HashMap<>();
        int maxf=0;
        int res=0;


        for (int x=0;x<s.length();x++){
            letters.put(s.charAt(x),letters.getOrDefault(s.charAt(x),0)+1);
            maxf=Math.max(maxf,letters.get(s.charAt(x)));

            while ((x-l+1)-maxf>k){
                letters.put(s.charAt(l),letters.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,(x-l+1));

        }
        return res;  
    }
}
