class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int pile : piles){
            high = Math.max(pile,high);
        }
        int result = high;
        while(low <=high){
            int k = low + (high -low) / 2;
            if(canFinish(piles,k, h)){
                result = k;
                high = k-1;
            }else{
                low = k+1;
            }
        }
        return result;
    }
    public static boolean canFinish(int[] piles, int k , int h){
        long totalHrs = 0;
        for(int pile : piles){
            totalHrs += (pile + k - 1) / k;
        }
        return totalHrs <=h;
    }
}
