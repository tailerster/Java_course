package Ex4;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static char[] numbers = {
            ' ', ' ', '*', '*', '*', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', '*', ' ', ' ', '*', '*', ' ',
            ' ', '*', ' ', '*', ' ', '*', ' ',
            ' ', '*', ' ', '*', ' ', '*', ' ',
            ' ', '*', '*', ' ', ' ', '*', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', '*', '*', '*', ' ', ' ',//0

            ' ', ' ', ' ', '*', ' ', ' ', ' ',
            ' ', ' ', '*', '*', ' ', ' ', ' ',
            ' ', '*', ' ', '*', ' ', ' ', ' ',
            ' ', ' ', ' ', '*', ' ', ' ', ' ',
            ' ', ' ', ' ', '*', ' ', ' ', ' ',
            ' ', ' ', ' ', '*', ' ', ' ', ' ',
            ' ', ' ', ' ', '*', ' ', ' ', ' ',
            ' ', '*', '*', '*', '*', '*', ' ',//1

            ' ', ' ', '*', '*', '*', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', ' ', ' ', '*', ' ', ' ',
            ' ', ' ', ' ', '*', ' ', ' ', ' ',
            ' ', ' ', '*', ' ', ' ', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', ' ', ' ',
            ' ', '*', '*', '*', '*', '*', ' ',//2

            ' ', ' ', '*', '*', '*', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', ' ', ' ', '*', ' ', ' ',
            ' ', ' ', ' ', '*', ' ', ' ', ' ',
            ' ', ' ', ' ', '*', ' ', ' ', ' ',
            ' ', ' ', ' ', ' ', '*', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', '*', '*', '*', ' ', ' ',//3

            ' ', ' ', ' ', ' ', '*', ' ', ' ',
            ' ', ' ', ' ', '*', '*', ' ', ' ',
            ' ', ' ', '*', ' ', '*', ' ', ' ',
            ' ', '*', ' ', ' ', '*', ' ', ' ',
            ' ', '*', '*', '*', '*', '*', ' ',
            ' ', ' ', ' ', ' ', '*', ' ', ' ',
            ' ', ' ', ' ', ' ', '*', ' ', ' ',
            ' ', ' ', ' ', ' ', '*', ' ', ' ',//4

            ' ', ' ', '*', '*', '*', '*', ' ',
            ' ', '*', ' ', ' ', ' ', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', ' ', ' ',
            ' ', ' ', '*', '*', '*', ' ', ' ',
            ' ', ' ', ' ', ' ', ' ', '*', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', '*', '*', '*', ' ', ' ',//5

            ' ', ' ', '*', '*', '*', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', '*', ' ', ' ', ' ', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', ' ', ' ',
            ' ', '*', '*', '*', '*', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', '*', '*', '*', ' ', ' ',//6

            ' ', '*', '*', '*', '*', '*', ' ',
            ' ', ' ', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', ' ', ' ', '*', ' ', ' ',
            ' ', ' ', ' ', '*', ' ', ' ', ' ',
            ' ', ' ', '*', ' ', ' ', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', ' ', ' ',//7

            ' ', ' ', '*', '*', '*', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', '*', ' ', '*', ' ', ' ',
            ' ', ' ', '*', '*', '*', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', '*', '*', '*', ' ', ' ',//8

            ' ', ' ', '*', '*', '*', ' ', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', '*', '*', '*', '*', ' ',
            ' ', ' ', ' ', ' ', ' ', '*', ' ',
            ' ', '*', ' ', ' ', ' ', '*', ' ',
            ' ', ' ', '*', '*', '*', ' ', ' ',//9
    };

    static void print_numbers(char[] num) {//12
        int const_length = 7, max = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= max) {
                max = num[i];
            }
        }
        for (int counter_high = 0; counter_high < 8; counter_high++) {
            for (int counter_length = 0; counter_length < num.length; counter_length++) {
                for (int j = 0; j < const_length; j++) {
                    if (max == num[counter_length] && numbers[(56 * (num[counter_length] - 48)) + counter_high * const_length + j] == '*')
                        System.out.print(max - 48 + " ");
                    else
                        System.out.print(numbers[(56 * (num[counter_length] - 48)) + counter_high * const_length + j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char in[];
        System.out.print("Enter number: ");
        in = scan.next().toCharArray();
        try {
            for (int i = 0; i < in.length; i++)
                if ((int) in[i] < 48 || (int) in[i] > 59)
                    throw new IOException("Incorrect enter");
            print_numbers(in);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}