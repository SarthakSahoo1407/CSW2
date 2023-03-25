package Recursive;

public class A06 {
    public static void permutation(int[] arr, int i, int length){
        if(i == length){
            for(int j = 0; j < length; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }else{
            for(int j = i; j < length; j++){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                permutation(arr, i + 1, length);
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, 0, arr.length);
    }

}

//In permutation method at each recursive call number at index, “i” is swapped with all the numbers that are right of it. Since the number is swapped with all the numbers in its right one by one it will produce all the permutation possible