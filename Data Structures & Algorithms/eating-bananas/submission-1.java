class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int low = 1;
        int high = 0;
        for(int item : nums){
            high = Math.max(item , high);
        }
        int result = high;
        while(low <= high){
            int k = low + (high - low) / 2;
            if(canFinish(nums, h, k)){
                result = k;
                high = k-1;
            }else{
                low = k + 1;
            }
            
        }
        return result;
    }
    public boolean canFinish(int[] piles, int h,int k){
        long totalHrs = 0;
        for(int item : piles){
            totalHrs += (item + k -1) / k ;
        }
        return totalHrs<=h;
    }
}
