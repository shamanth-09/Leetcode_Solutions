class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int currentSum = 0, finalSum = 0, win = 1;
        for (win = 1; win <= arr.length; win += 2) {
            currentSum = sumOfWindow(arr, win);
            finalSum += currentSum;
        }
        return finalSum;
    }

    public static int sumOfWindow(int arr[], int k) {
        int currSum = 0, absSum = 0;
        for (int j = 0; j < k; j++) {
            currSum += arr[j];
        }
        absSum+=currSum;
        for (int j = k; j < arr.length; j++) {
            currSum = currSum - arr[j - k] + arr[j];
            absSum += currSum;
        }
        return absSum;
    }
}
