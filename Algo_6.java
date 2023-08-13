import java.util.Scanner;

public class Algo_6 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the sentence : ");
        String sentence = scanner.nextLine();
        String[] stringArray = sentence.split(" ");
        int count =stringArray.length;
        while (--count >= 0) {
            if (count != stringArray.length - 1) {
                System.out.print(" ");
            }
            System.out.print(stringArray[count]);
            if (count == 0) {
                System.out.print(".");
            }

        }
        System.out.println();
        
    }
}
