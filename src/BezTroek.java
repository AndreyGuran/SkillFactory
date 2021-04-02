import java.util.Scanner;

public class BezTroek {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Введите число ");

        int number = read.nextInt();

        do {
            if (number % 3 > 0 && number % 10 != 3) {
                System.out.println(number);
            }

            number = number - 1;

        } while (number > 0);

    }
}
