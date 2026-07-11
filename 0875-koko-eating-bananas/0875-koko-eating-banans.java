class Solution{
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        int low = 1;
        int high = max;

        while(low < high){
            int mid = low + (high - low)/2;
            if(canEat(piles, mid, h)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean canEat(int[] piles, int speed, int h){
        int hours = 0;
        for(int i = 0; i < piles.length; i++){
            hours += Math.ceil((double)piles[i]/speed);
        }
        return hours <= h;
    }
}