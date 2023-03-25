package Array;

public class A03 {
    public static int BinarySearch(int arr[], int size, int value) {
        int mid;
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == value) {
                return mid;
            } else {
                if (arr[mid] < value) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int value = 5;
        System.out.println("The position of "+value + " is "+BinarySearch(arr, arr.length, value));
    }
}
    //Since we have data sorted in increasing / decreasing order, we can search efficiently by applying binary search. At each step, we reduce our searc space by half.
    //At each step, we compare the middle value with the value we are searching. If mid value is equal to the value we are searching for then we return the middle index.
    //If the value is smaller than the middle value, we search the left half of the array.
    //If the value is greater than the middle value then we search the right half of the array.
    //If we find the value we are looking for then its index is returned otherwise -1 is returned.
    //Time complexity of this algorithm is O(logn)