class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        
        long low = 1;

        int minTime = Integer.MAX_VALUE;
        for(int t : time){
            minTime = Math.min(minTime ,t);
        }

        long high = (long )minTime * totalTrips;

        while(low<=high){
            long mid = low + (high - low) / 2;
             long trips = 0;

             for(int t : time){
                trips = trips + mid / t;
             }

                if(trips >= totalTrips){
                    high = mid -1 ;
                } else{
                    low = mid + 1;
                }
             }
        
        return low;
    }
}