package Ex5;

import java.util.Deque;
import java.util.LinkedList;

public class Safe {
    private static final int power = 5; //number of objects
    int safe;
    Staff[] staff_mas = new Staff[power];
    int[] matrix = new int[2*power];

    Safe() {
    }

    Safe(int safe) {
        this.safe = safe;
    }

    void calculate() {
        Staff[] strBox = staff_mas;
        Deque<Integer> indexes = new LinkedList<>();
        for (int i = 1; i < staff_mas.length + 1; i++)
            make(strBox, indexes, i);
    }

    void make(Staff[] arr, Deque<Integer> indexes, int expectedSize) {
        if (indexes.size() == expectedSize) {
            int sum_volume = 0, sum_value = 0;
            for (Integer i : indexes) {
                sum_volume += arr[i].volume;
                sum_value += arr[i].value;
                //System.out.print("("+arr[i].volume + ":" + arr[i].value + ") ");
            }
            //System.out.print("= ("+sum_volume+":"+sum_value+")");
            if (sum_volume <= this.safe && this.matrix[(expectedSize - 1) * 2 + 1] <= sum_value) {
                this.matrix[(expectedSize - 1) * 2] = sum_volume;
                this.matrix[(expectedSize - 1) * 2 + 1] = sum_value;
            }
            //System.out.println();
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!indexes.contains(i)) {
                indexes.addLast(i);
                make(arr, indexes, expectedSize);
                indexes.removeLast();
            }
        }
    }

    void all_result() {
        for (int i = 0; i < matrix.length / 2; i++) {
            System.out.print("For " + (i + 1) + " objects in safe with volume = " + safe + ": min volume");
            if (matrix[2 * i] == 0)
                System.out.print(" > " + safe + "\n");
            else
                System.out.print(" = " + matrix[2 * i] + ", max value = " + matrix[2 * i + 1] + "\n");

        }
    }

    void final_result() {
        int max_value = 0;
        for (int i = 0; i < matrix.length / 2; i++) {
            if (matrix[2 * i + 1] >= max_value) max_value = matrix[2 * i + 1];
        }
        System.out.println("\nThe best result is value = " + max_value);
    }
}
