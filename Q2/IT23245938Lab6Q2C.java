import java.util.Scanner;

public class IT23245938Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int num;
        int sum = 0;

        while (i <= 10) {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            sum = sum + num;
            i++;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / 10.0));

        input.close();
    }
}