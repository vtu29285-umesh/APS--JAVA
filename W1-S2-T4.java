class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Calculate total sum of all elements
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            // Elements to the left:
            // nums[i] - nums[j]
            int leftCount = i;
            int leftContribution = nums[i] * leftCount - leftSum;

            // Elements to the right:
            // nums[j] - nums[i]
            int rightCount = n - i - 1;
            int rightSum = totalSum - leftSum - nums[i];
            int rightContribution = rightSum - nums[i] * rightCount;

            result[i] = leftContribution + rightContribution;

            leftSum += nums[i];
        }

        return result;
    }
}
