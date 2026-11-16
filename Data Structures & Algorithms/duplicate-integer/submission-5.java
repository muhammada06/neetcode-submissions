class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> items=new HashSet<>();

        for (int num:nums){
            if (items.contains(num)){
                return true;
            }
            else{
                items.add(num);
            }
        }

        return false;
        
    }
}