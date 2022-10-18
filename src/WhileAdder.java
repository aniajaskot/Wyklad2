import java.util.Scanner;

public class WhileAdder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;

        while(i<5){
            System.out.println("Podaj liczbe numer" + (i+1));
//            sum = sum + scanner.nextInt();
            sum += scanner.nextInt();
            scanner.nextLine();
            i++;
        }

//        while(i<5){
//            System.out.println("Podaj liczbe numer" + (i+1));
//            int number = scanner.nextInt();
//            scanner.nextLine();
//            sum = sum + number;
//            i++;
//        }
        System.out.println("suma wynosi " + sum);
    }
}
