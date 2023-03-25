package Recursive;

public class A07 {
    public static int BinarySearch(int arr[], int low, int high, int value){
        if(low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if(arr[mid] == value){
            return mid;
        }else if(arr[mid] > value){
            return BinarySearch(arr, low, mid - 1, value);
        }else{
            return BinarySearch(arr, mid + 1, high, value);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = 5;
        int index = BinarySearch(arr, 0, arr.length - 1, value);
        if(index == -1){
            System.out.println("Value not found");
        }else{
            System.out.println(value +" found at index: " + index);
        }
    }
}
