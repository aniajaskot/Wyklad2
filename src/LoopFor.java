public class LoopFor {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for(int i = 0; i<5; i++){
            numbers[i] = i*10;
        }

//        for (int i = 0; i<5; i++){
//            System.out.println(numbers[i]);
//        }
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
