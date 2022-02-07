package Ex1;

public class Main {
    static int get_sum(String input) {
        String substr;
        int num, counter = 0;
        for (int i = 0; i < input.length(); i++) {
            substr = input.substring(i, i + 1);
            num = 0;
            try {
                num = Integer.parseInt(substr);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect enter");
            }
            counter += num;
        }
        return counter;
    }

    public static void main(String[] args) {
        String str1 = "a1b2c3d4f5", str2 = "123456789", str3 = "NaN";
        System.out.println("Sum numbers in " + str1 + " = " + get_sum(str1));
        System.out.println("Sum numbers in " + str2 + " = " + get_sum(str2));
        System.out.println("Sum numbers in " + str3 + " = " + get_sum(str3));
    }
}
