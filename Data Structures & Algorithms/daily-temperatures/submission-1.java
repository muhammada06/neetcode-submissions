class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] results=new int [temperatures.length];
        Stack<int []> values=new Stack<>();

        values.push(new int [] {temperatures[0],0});


        for (int x=1;x<temperatures.length;x++){

            if (values.peek()[0]>=temperatures[x]){
                values.push(new int[]{temperatures[x],x});
            }

            else{
                while (!values.isEmpty() && temperatures[x]>values.peek()[0]){
                    int [] temp=new int [2];
                    temp=values.pop();
                    results[temp[1]]=(x-temp[1]);



                }
                values.push(new int[]{temperatures[x],x});
            }

        }

return results;
    }
}
