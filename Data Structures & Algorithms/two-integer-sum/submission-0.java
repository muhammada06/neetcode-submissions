class Solution {
    public int[] twoSum(int[] nums, int target) {
        int var1;
        int var2;
        int diff;

        for (int x=0;x<nums.length-1;x++){
            var1=x;
            diff=target-nums[x];
            for (int i=x+1;i<nums.length;i++){
                if (nums[i]==diff){
                    return new int[]{var1,i};
                }

            }
        }

        return null;

    
        
    }
}