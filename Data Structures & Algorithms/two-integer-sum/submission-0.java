class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer > containerMap = new HashMap();
        int[] result = new int[2];
        for(int i= 0 ; i < nums.length ; i++){
            int complement = target - nums[i];
            int index = containerMap.getOrDefault(complement , -1);
            if(index != -1){
                result[0] = index;
                result[1] = i;
                break;
            }
            containerMap.put(nums[i], i );
        }
        return result;
    }
}
