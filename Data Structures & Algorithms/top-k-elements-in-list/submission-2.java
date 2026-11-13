class Solution {
    public int[] topKFrequent(int[] nums, int k) {

      //Final array
      int [] arr=new int[k];

      //"Value" Array
      int [] value_array=new int[nums.length+1];

      //Frequency Table Hash Map
      HashMap <Integer,Integer> freq=new HashMap<>();

      //CREATING FREQUENCY TABLE 
      for (int x=0;x<nums.length;x++){
        if (freq.containsKey(nums[x])){
          freq.put(nums[x],freq.get(nums[x])+1);
        }
        else{
          freq.put(nums[x],1);
        }
      }

      HashMap <Integer, ArrayList<Integer>> ordered=new HashMap<>();

       for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
        if ((!ordered.containsKey(entry.getValue()))){
          ArrayList<Integer> temp=new ArrayList<>();
          temp.add(entry.getKey());
          ordered.put(entry.getValue(),temp);
        }

        else{
          ordered.get(entry.getValue()).add(entry.getKey());
        }
       }


       //Now finding K most frequent
       int counter=0;
       ArrayList<Integer> values=new ArrayList<>();
       for (int x=nums.length;x>0;x--){
        if (counter==k){
          break;
        }
         if (ordered.containsKey(x)){
          values.addAll(ordered.get(x));
          counter+=ordered.get(x).size();
         }
       }

       arr = new int[values.size()];

for (int i = 0; i < values.size(); i++) {
    arr[i] = values.get(i);
}
       return arr;     
    }
}
