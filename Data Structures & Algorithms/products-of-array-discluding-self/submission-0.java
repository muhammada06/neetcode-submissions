class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prefix=new int [nums.length];
        int [] suffix=new int [nums.length];
        int [] product=new int [nums.length];

        int p=1;
        int s=1;

        prefix[0]=1;
        suffix[nums.length-1]=1;

        for (int x=1;x<nums.length;x++){
            p*=nums[x-1];
            prefix[x]=p;
        }

         for (int x=nums.length-2;x>=0;x--){
            s*=nums[x+1];
            suffix[x]=s;
        }

        for (int x=0;x<suffix.length;x++){
            product[x]=prefix[x]*suffix[x];
        }

        return product;

        

        




        
    }
}  
