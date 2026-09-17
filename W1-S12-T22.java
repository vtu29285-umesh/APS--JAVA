class Solution {
    public int[] finalPrices(int[] prices) {

        int n = prices.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {

            answer[i] = prices[i]; // initially, no discount

            // Find the first j > i such that prices[j] <= prices[i]
            for (int j = i + 1; j < n; j++) {

                if (prices[j] <= prices[i]) {
                    answer[i] = prices[i] - prices[j];
                    break; // minimum index found
                }
            }
        }

        return answer;
    }
}
