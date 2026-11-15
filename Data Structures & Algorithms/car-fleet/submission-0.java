class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int [][] cars=new int [position.length][2];

        for (int x=0;x<position.length;x++){
            cars[x][0]=position[x];
            cars[x][1]=speed[x];
        }

        //Sorting all the arrays in decending order
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        int fleets=1;
        double prevFleet= (double)(target-cars[0][0])/(cars[0][1]);

        for (int x=1; x<position.length;x++){
            if ((double)(target-cars[x][0])/(cars[x][1])>prevFleet){
                prevFleet=(double)(target-cars[x][0])/(cars[x][1]);
                fleets++;
            }
        }  


        return fleets;

    }
}
