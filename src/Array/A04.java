package Array;

public class A04 {
    public static int maxSubArraySum(int[] a, int size) {
        int maxSoFar = 0, maxEndingHere = 0;
        for (int i = 0; i < size; i++) {
            maxEndingHere = maxEndingHere + a[i];
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;

    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -4, 6, -4, 3, 2};
        System.out.println("Max sub array sum : " + maxSubArraySum(arr, 9));
    }
}

//Maximum subarray in an Array is found in a single scan. We keep track of global maximum sum so far and the maximum sum, which include the current element.
//When we find global maximum value so far is less than the maximum value containing current value we update the global maximum value.
// Finally return the global maximum value
//Time complexity of this algorithm is O(n)