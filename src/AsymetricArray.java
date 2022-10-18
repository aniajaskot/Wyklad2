public class AsymetricArray {
    public static void main(String[] args) {
//        int[][] array = new int[4][];

//        wersja 1
//        array[0] = new int[3];
//        array[1] = new int[2];
//        array[2] = new int[4];
//        array[3] = new int[1];
//
//        array[0][0] = 1;
//        array[0][1] = 2;
//        array[0][2] = 3;
//        array[1][0] = 4;
//        array[1][1] = 5;
//        array[2][0] = 6;
//        array[2][1] = 7;
//        array[2][2] = 8;
//        array[2][3] = 9;
//        array[3][0] = 10;

//        wersja2
//        array[0] = new int[]{1,2,3};
//        array[1] = new int[]{4,5};
//        array[2] = new int[]{6,7,8,9};
//        array[3] = new int[]{10};

        int[][] array = {
                {1,2,3},
                {4,5},
                {6,7,8,9},
                {10}
        };

        int sum = array[0][0] + array[1][0]+array[2][0]+array[3][0];
        System.out.println("Suma " + sum);

    }
}
