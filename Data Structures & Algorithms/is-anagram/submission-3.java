class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }

        HashMap <Character,Integer> sMap=new HashMap<>();
        HashMap <Character,Integer> tMap=new HashMap<>();

        for (int x=0;x<s.length();x++){

            if (sMap.get((s.charAt(x)))==null){
                sMap.put(s.charAt(x),1);
            }
            else{
                sMap.put(s.charAt(x),sMap.get(s.charAt(x))+1);

            }
            if (tMap.get((t.charAt(x)))==null){
                tMap.put(t.charAt(x),1);
            }
            else{
                tMap.put(t.charAt(x),tMap.get(t.charAt(x))+1);
            }
        }
        for (Character key : sMap.keySet()) {
    if (!sMap.get(key).equals(tMap.get(key))) {
        return false;
    }
}

return true;
















    }
}
