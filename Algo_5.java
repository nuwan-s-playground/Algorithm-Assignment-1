import java.util.Arrays;
import java.util.Scanner;

public class Algo_5 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter the text : ");
        String text = scanner.nextLine();
        char[] charArray = new char[text.length()];
        if (text.strip().length() == 0) {
            System.out.println("Enter the valid text.");
        } else {
            int count = 0;
            do {
                charArray[text.length() - 1 - count] = text.charAt(count);

            } while (count++ + 1 < text.length());
            for (int index = 0; index < charArray.length; index++) {
                System.out.print(charArray[index]);
            }
        }
        System.out.println();
        
        
    }
}
