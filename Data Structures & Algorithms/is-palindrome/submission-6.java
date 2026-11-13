class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;


        while (start<end){
            while (start<end &&!isAlpha(s.charAt(start))){
                start++;
            }

            while (start<end && !isAlpha(s.charAt(end))){
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
{
                return false;
            }

            start++;
            end--;
        }

return true;




    }










    public boolean isAlpha (char c){
        if (c>='a' && c<='z'){
            return true;
        }
        if (c>='A' && c<='Z'){
            return true;
        }
        if (c>='0' && c<='9'){
            return true;
        }
        return false;
    }








}
