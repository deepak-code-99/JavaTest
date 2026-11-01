import java.util.Scanner;
// a header of the program
public class Calculator {
    public static void main(String[] args) {
        // inputing value

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        double total = input.nextDouble();
        while (true) {
            char operator = input.next().charAt(0);
            if (operator == '=') {
                break;

            }
            double nextnum = input.nextDouble();
            if (operator == '+') {
                total += nextnum;
            } else if (operator == '-') {
                total -= nextnum;
            } else if (operator == '*') {
                total *= nextnum;

            } else if (operator == '/') {
                if (nextnum != 0) {
                    total /= nextnum;
                } else {
                    System.out.println("Cannot divide by zero");
                }


            }

        }
        System.out.println("total: " + total);
    }
}



