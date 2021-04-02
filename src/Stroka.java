import java.util.Scanner;

public class Stroka {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите слово ");
        String inputString = read.nextLine();
        int stringLength = inputString.length();
        String result = "";

        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        System.out.println(result);

    }
}
