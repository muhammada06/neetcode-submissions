class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <HashMap<Character,Integer>,ArrayList<String>> frequency=new HashMap<>();

        for (int x=0;x<strs.length;x++){
            char [] arr=strs[x].toCharArray();
            HashMap<Character,Integer> freq=new HashMap<>();

            for (int i=0;i<arr.length;i++){
                if (freq.containsKey(arr[i])){
                    freq.put(arr[i],freq.get(arr[i])+1);
                }
                else{
                    freq.put(arr[i],1);
                }
            }
            if (frequency.containsKey(freq)){
                ArrayList <String> strings=frequency.get(freq);
                strings.add(strs[x]);
                frequency.put(freq,strings);
            }
            else{
                ArrayList <String> strings=new ArrayList<>();
                strings.add(strs[x]);
                frequency.put(freq,strings);
            }
        }

        List<List<String>> valueList = new ArrayList<>(frequency.values());
        return valueList;










        
    }
}
