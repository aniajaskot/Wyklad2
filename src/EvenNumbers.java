import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres");
        int bound = scanner.nextInt();
        scanner.nextLine();

        int sumFor = 0;
        for(int i = 0 ; i <= bound; i+=2){
            System.out.println(i);
            sumFor += i;
        }

        System.out.println("Suma= " + sumFor);

        int i = 0;
        int sumWhile = 0;
        while (i <= bound){
            System.out.println(i);
            sumWhile += i;
            i += 2;
        }
        System.out.println("Suma= " + sumWhile);
    }
}
