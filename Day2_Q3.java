import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        boolean isFound = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("The string contains the character " + ch);
        } else {
            System.out.println("The string does not contain the character " + ch);
        }
    }
}