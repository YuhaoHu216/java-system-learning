import java.util.Random;

public class Damo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            int index = r.nextInt(0,5);
//            arr[i] += arr[index];
//            arr[index] = arr[i] - arr[index];
//            arr[i] = arr[i] - arr[index];
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
        for (int j : arr) {

            System.out.print(j + " ");
        }
    }
}
