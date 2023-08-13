import java.util.Scanner;

public class Algo_1 {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        scanner.nextLine();
        final int FIRSTFIBNUM = 0;
        final int SECONDFIBNUM = 1;
        int previousNum =FIRSTFIBNUM;
        int currentNum = SECONDFIBNUM;
        int nextNum;
        if (number > 0) {
            System.out.print("Fibonacci sequence is : ");
            System.out.print(FIRSTFIBNUM+","+SECONDFIBNUM);
             do{

                if (number == 1) {
                    break;
                }
                nextNum = previousNum+ currentNum;
                previousNum = currentNum;
                currentNum = nextNum;
                if (currentNum > number) {
                    break;
                }
                System.out.print("," + currentNum);
                
            } while (currentNum < number);
        System.out.println();

        }
        else{
            System.out.println("Enter the positive number.");
        }
       
    }
}