class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> letters=new HashSet<>();
        int max_size=0;
        int first_index=0;



        for (int x=0;x<s.length();x++){
            //ASSUMING CONTINUATION OF CHAIN
            if (!letters.contains(s.charAt(x))){
                letters.add(s.charAt(x));
            }

            else{
                while (s.charAt(first_index)!=s.charAt(x)){
                    letters.remove(s.charAt(first_index));
                    first_index++;
                }
                first_index++;
                
            }
            max_size=Math.max(max_size,(x-first_index)+1);
        }
    
        return max_size;
    }
}
