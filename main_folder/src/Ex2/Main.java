package Ex2;

import java.util.Scanner;

public class Main {

    static void found (int input, int num) {
        if (input == 1)
            return;
        if (input%num == 0) {
            System.out.print(" * " + num);
            found(input/num, num);
        }
        else {
            found(input, num+1);
        }
    }

    public static void main(String[] args) {
        String input;
        int num;
        Scanner scan = new Scanner(System.in);
        input = scan.next();
        try {
            num = Integer.parseInt(input);
            System.out.print(input + " = 1");
            found(num,2);
        }
        catch (NumberFormatException e) {
            System.out.println("Incorrect enter");
        }
        catch (StackOverflowError e) {
            System.out.println(" -> ERROR");
        }
    }
}
