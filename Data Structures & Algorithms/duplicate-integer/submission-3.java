class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer,Integer> map= new HashMap<>();
        for (int x: nums){
            if (map.get(x)==null){
                map.put(x,1);
            }

            else{
                return true;
            }
        }

        return false;

       




        
    }
}