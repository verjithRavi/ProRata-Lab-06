import java.util.Scanner;

public class IT23245938Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int number;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();

            System.out.print(number + " ");
            i++;
        }

        input.close();
    }
}