class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low;
        int high;
        int difference;

        for (int x=0;x<numbers.length;x++){
            difference=target-numbers[x];
            low=x+1;
            high=numbers.length-1;
            
            while (low<=high){
                int mid=(low+high)/2;

                if (numbers[mid]==difference){
                    return new int []{x+1,mid+1};
                }

                if (numbers[mid]>difference){
                    high=mid-1;
                }

                 if (numbers[mid]<difference){
                    low=mid+1;
                }
            }
        }
        return null;
    }
}
