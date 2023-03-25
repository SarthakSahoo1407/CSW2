package Array;

public class A02 {
    public static int SequentialSearch(int arr[], int value) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (value == arr[i]) {
                {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int value = 5;
        System.out.println("The position of "+value + " is "+SequentialSearch(arr, value));
    }
}

//Since we have no idea about the data stored in the array, or if the data is not sorted then we have to search the array in sequential manner one by one.
//If we find the value, we are looking for we return its index.
//· Else, we return index -1 in the end, as we did not find the value we are looking for.
//The elements of the array are traversed sequentially so the Time complexity is O(n)

