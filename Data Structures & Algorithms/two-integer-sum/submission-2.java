class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer,Integer> frequency= new HashMap<>();

        for (int x=0;x<nums.length;x++){
            int difference=target-nums[x];

            if (frequency.containsKey(difference)){
                int [] arr={frequency.get(difference),x};
                return arr;
            }

            else{
                frequency.put(nums[x],x);
            }

        }

        return null;




        

    }
}
