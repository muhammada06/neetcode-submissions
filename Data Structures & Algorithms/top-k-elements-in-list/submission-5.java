class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> count = new HashMap<>();

        List<Integer>[] frequency=new List[nums.length+1];



        for (int n:nums){
            count.put(n,count.getOrDefault(n,0)+1);
        } 

        for (int x=0;x<frequency.length;x++){
            frequency[x]=new ArrayList<>();
        }



        for (Map.Entry<Integer,Integer> entry: count.entrySet()){
            frequency[entry.getValue()].add(entry.getKey());
        }

        int result[]=new int [k];
        int cur=0;

        for (int x=frequency.length-1;x>=0;x--){
            for (int n:frequency[x]){
                result[cur]=n;
                cur++;
                
            }


            if (cur==k){
                return result;
            }
        }
        return result;
    }
}
