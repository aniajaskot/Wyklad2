import java.util.Scanner;

public class LoopForEach {
    public static void main(String[] args) {
        String[] names = new String[3];
        Scanner sc = new Scanner(System.in);

        for (String name : names) {
            name = sc.nextLine();
        }
        sc.close();

        System.out.println(names[0]);//null
    }
}

