import java.util.Arrays;

public class NamesArray {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Jan";
        names[1] = "Karol";
        names[2] = "Kasia";
        System.out.println(names); //źle [Ljava.lang.String;@15db9742
        System.out.println(names[0]); //Jan
        System.out.println(names[1]); //Karol
        System.out.println(names[2]); //Kasia
        //lub
        String arrayString = Arrays.toString(names);
        System.out.println(arrayString);
    }
}