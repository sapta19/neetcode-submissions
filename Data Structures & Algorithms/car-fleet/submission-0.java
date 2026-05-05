class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // Ctreate 2D array
        int n = position.length;
        int currentMax = 0;
        double[][] cars = new double[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        Arrays.sort(cars, (b, a) -> Double.compare(a[0], b[0]));

        Stack<Double> intStack = new Stack();

        for (int i = 0; i < n; i++) {
            double currentTime = cars[i][1];

            if (intStack.isEmpty() || currentTime > intStack.peek()) {
                intStack.push(currentTime);
            }
        }
        return intStack.size();
    }
}
