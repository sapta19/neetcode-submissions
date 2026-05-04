class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> tempStack = new Stack();
        int n = temperatures.length;
        int indexToSet,cnt = 0 ;
        int[] result = new int[n];
        tempStack.push(0);
        for (int i = 1; i < n; i++) {
            while(!tempStack.isEmpty() && temperatures[i] > temperatures[tempStack.peek()]){
                int poppedIndx = tempStack.pop();
                result[poppedIndx] = (i - poppedIndx);
            }
            tempStack.push(i);
        }
        return result;
    }
}
