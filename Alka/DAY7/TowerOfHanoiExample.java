package Pappu.DAY7;

public class TowerOfHanoiExample {

    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        // Base case: if there is only one disk, move it from 'fromRod' to 'toRod'
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return;
        }
        // Recursive case: move n-1 disks from 'fromRod' to 'auxRod', using 'toRod' as auxiliary
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        // Move the nth disk from 'fromRod' to 'toRod'
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);
        // Move n-1 disks from 'auxRod' to 'toRod', using 'fromRod' as auxiliary
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 3;  // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B, C are names of the rods
    }
}
