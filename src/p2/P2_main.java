package p2;

public class P2_main {
    public static void main(String[] args) {
        int[] numbers = {23, 88,-10,55,39, -200,-1};
        int max = 84;
        int minIndex = 3;

        max = numbers[0];
        minIndex = 0;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }

            if(numbers[i] < numbers[minIndex]){
                minIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(minIndex);
    }
}
