class Solution {
    public int longestConsecutive(int[] nums) {

        //Handelling of edge cases
        if (nums.length<=1){
            return nums.length;
        }

        Set<Integer> all_elements = new HashSet<>();
        Set<Integer> beginning_element = new HashSet<>();

        for (int x=0;x<nums.length;x++){
            all_elements.add(nums[x]);
        }

        for (int i : all_elements){
        if (!all_elements.contains(i-1)){
                beginning_element.add(i);
            }
        }
    
     

        int counter=1;

        for (int i : beginning_element){
            int temp_counter=1; 
            int current_index=i+1;
            boolean in_sync=true;
            while (in_sync==true){
            if (all_elements.contains(current_index)){
                temp_counter++;
                current_index++;
            }
            else{
                in_sync=false;
            
            }
            }
            if (temp_counter>counter){
                counter=temp_counter;

            }
        }

        return counter;   
    }
}
