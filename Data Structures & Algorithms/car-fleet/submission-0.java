class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> times = new Stack<>();

        int[][] cars = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (car1, car2) -> Integer.compare(car2[0], car1[0]));
        
        double prevTime = 0;
        for(int i = 0; i < position.length; i++){
            double currTime = (double)(target - cars[i][0]) / cars[i][1];


            if(times.isEmpty()){
                times.push(currTime);
                prevTime = currTime;
                continue;
            }
            if(currTime > prevTime){
                times.push(currTime);
                prevTime = currTime;               
            }

                
        }
        return times.size();
    }
}