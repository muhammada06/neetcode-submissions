class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> frequencyMap1 = new HashMap<>();
        Map<Character, Integer> frequencyMap2 = new HashMap<>();


        if (s.length()!=t.length()){
            return false;
        }


//GET ALL THE STUFF PUT INTO A CHART
        for (int x=0;x<s.length();x++){
            if (frequencyMap1.containsKey(s.charAt(x))){
                frequencyMap1.put(s.charAt(x), frequencyMap1.get(s.charAt(x))+1);
            }
            else{
                frequencyMap1.put(s.charAt(x),1);
            }


             if (frequencyMap2.containsKey(t.charAt(x))){
                frequencyMap2.put(t.charAt(x), frequencyMap2.get(t.charAt(x))+1);
            }
            else{
                frequencyMap2.put(t.charAt(x),1);
            }
        }


//COMPARE EVERYTHING IN THE CHART

    for (Character m:frequencyMap1.keySet()){
        if (!frequencyMap1.get(m).equals(frequencyMap2.get(m))){
            return false;
        }

    }

    return true;







    }
}