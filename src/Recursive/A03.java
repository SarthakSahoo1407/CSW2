package Recursive;

public class A03 {
    public static void towerOfHanoi(int num, char src, char dst, char temp){
        if(num == 1){
            System.out.println("Move disk 1 from rod " + src + " to rod " + dst);
            return;
        }
        towerOfHanoi(num-1, src, temp, dst);
        System.out.println("Move disk " + num + " from rod " + src + " to rod " + dst);
        towerOfHanoi(num-1, temp, dst, src);
    }
    public static void main(String[] args) {
        int n = 10;
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}


// If we want to move N disks from source to destination, then we first move N-1 disks from source to temp, and then move the lowest Nth disk from source to destination. Then it will move N-1 disks from temp to destination.