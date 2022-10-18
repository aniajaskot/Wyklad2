import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];// 0 1 2 3 4

        for(int i = 0; i<names.length; i++){
            System.out.println("podaj imie nr " + (i+1));
            names[i] = scan.nextLine();
        }

        for(int i = names.length - 1; i>=0; i--){
            System.out.println("czesc " + names[i]);
        }

    }
}
