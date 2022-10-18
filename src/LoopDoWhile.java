import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        int guessNumber = 77;
        Scanner scan = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("Zgadnij liczbe");
            userChoice = scan.nextInt();
            scan.nextLine();
        }while(userChoice != guessNumber);

        System.out.println("Zgadłes!!!");
    }
}
