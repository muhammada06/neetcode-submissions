class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        Map<Character, Integer> letters = new HashMap<>();
        int maxf=0;
        int res=0;



        //Iterare through the string; Only needed to be done once
        for (int x=0;x<s.length();x++){

            //Put the new letter, dervided from the expansion of the window into the frequency chart
            letters.put(s.charAt(x),letters.getOrDefault(s.charAt(x),0)+1);

            //Find out if the new letter, makes the max frequency any bigger
            maxf=Math.max(maxf,letters.get(s.charAt(x)));

            //While the number of imposter letters excedes k, move the sliding wondow right and take out the letter removed 
            while ((x-l+1)-maxf>k){
                letters.put(s.charAt(l),letters.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,(x-l+1));

        }
        return res;  
    }
}
