import java.util.Scanner;

public class IT23245938Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        double sumOfSquares = 0;

        System.out.println("Enter positive numbers (-99 to stop):");

        while (true) {
            num = input.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input. Enter only positive numbers.");
                continue;
            }

            sumOfSquares = sumOfSquares + (num * num);
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("Root Mean Square = " + rms);
        } else {
            System.out.println("No valid numbers entered.");
        }

        input.close();
    }
}