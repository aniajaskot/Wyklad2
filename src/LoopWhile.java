import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        int guessNumber = 77;
        Scanner scan = new Scanner(System.in);
        System.out.println("Zgadnij liczbe");
        int userChoice = scan.nextInt();
        scan.nextLine();

        while(userChoice != guessNumber){
            System.out.println("Nie zgadłes. Sprobuj ponownie");
            userChoice = scan.nextInt();
            scan.nextLine();
        }
        System.out.println("Zgadłes!!!");
    }
}
