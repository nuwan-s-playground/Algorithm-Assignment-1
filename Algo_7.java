import java.util.Scanner;

public class Algo_7 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String longestWord="";
        String shortestWord="";
        System.out.print("Enter the sentence : ");
        String sentence = scanner.nextLine();
        if (sentence.strip().length() == 0) {
            System.out.println("Enter the valid sentence.");
        } else {
            String[] stringArray = sentence.split(" ");
            for (int index = 0; index < stringArray.length; index++) {
                if (index == 0) {
                    if (stringArray[index].length() > stringArray[index + 1].length()) {
                        longestWord = stringArray[index];
                        shortestWord = stringArray[index + 1];
                    } else {
                        longestWord = stringArray[index + 1];
                        shortestWord = stringArray[index];
                    }
                } else {
                    if (stringArray[index].length() > longestWord.length()) {
                        longestWord = stringArray[index];
                    } else {
                        if (shortestWord.length() > stringArray[index].length()) {
                            shortestWord = stringArray[index];
                        }
                    }
                }
            }
        }
        System.out.println("longest word is " + longestWord);
        System.out.println("Sortest word is "+ shortestWord);
        
    }
}
