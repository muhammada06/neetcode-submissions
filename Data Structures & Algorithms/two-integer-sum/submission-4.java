class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Number, Index
        HashMap<Integer,Integer> numbers=new HashMap<>();

        int required_value; 

        for (int x=0;x<nums.length;x++){
            required_value=target-nums[x];
            if (numbers.containsKey(required_value)){
                return new int[]{numbers.get(required_value),x};
            }
            else{
                numbers.put(nums[x],x);
            }
        } 

        return null;
    }
}
