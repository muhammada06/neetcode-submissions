class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int x=0;x<nums.length;x++){
            //REMOVED THE NEED OF DUPLICATES
            if (x>0 && nums[x]==nums[x-1]){
                continue;
            }

            if (nums[x]>0){
                break;
            }

            int start=x+1;
            int end=nums.length-1;

    
            while (start<end){
                if (nums[start]+nums[end]>-nums[x]){
                    end--;
                }

                else if (nums[start]+nums[end]<-nums[x]){
                    start++;
                }

                else{
                    result.add(new ArrayList<>(List.of(nums[x], nums[start], nums[end])));
                  start++;
                  end--;

                  while (start<end && nums[start]==nums[start-1]){
                    start++;
                  }

                  while (start<end && nums[end]==nums[end+1]){
                    end--;
                  }

                    
                }
            }
        }

        return result;
    }
}
