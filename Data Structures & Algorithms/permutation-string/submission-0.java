class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()){
            return false;
        }

        //First, make 2 arrays with size 26 to symbolize the frequency for each letter;
        int [] arr1=new int [26];
        int [] arr2=new int [26];

        //Creation of initial window
        for (int x=0;x<s1.length();x++){
            arr1[s1.charAt(x)-'a']++;
            arr2[s2.charAt(x)-'a']++;
        }

        int matches=0;

        //Count initial matches

        for (int x=0;x<26;x++){
            if (arr1[x]==arr2[x]){
                matches++;
            }
        }


        int l=0;
        for (int r=s1.length();r<s2.length();r++){
            if (matches==26){return true;}

            
            //EXPANDING THE WINDOW
            int index= (s2.charAt(r)-'a');
            arr2[index]++;
            if (arr1[index]==arr2[index]){
                matches++;
            }
            else if (arr1[index]==arr2[index]-1){
                matches--;
            }

            index= (s2.charAt(l)-'a');
            arr2[index]--;
             if (arr1[index]==arr2[index]){
                matches++;
            }
            else if (arr1[index]==arr2[index]+1){
                matches--;
            }
            l++;
        }

         if (matches==26){return true;}
         else{return false;}


    }
}
