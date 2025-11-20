package h1;
import java.util.Arrays;

public class H1_main {

    public static void main(String[] args) {
        int[] myArray = {1,3,5,12};
        int x;

        for (int i = 0; i < (myArray.length / 2); i++){
            x = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = myArray[i];
            myArray[i] = x;
        }

        System.out.println(Arrays.toString(myArray));
    }

}
