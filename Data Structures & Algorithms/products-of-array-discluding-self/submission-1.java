class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];

        //Loading prefix array
       
        prefix[0]=1;
        suffix[nums.length-1]=1;
        for (int x=1;x<nums.length;x++){
            prefix[x]=prefix[x-1]*nums[x-1];

        }

        for (int x=nums.length-2;x>=0;x--){
            suffix[x]=suffix[x+1]*nums[x+1];

        }

        int result[]=new int[nums.length];

        for (int x=0;x<nums.length;x++){
            result[x]=prefix[x]*suffix[x];
        }


return result;



        
    }
}  
