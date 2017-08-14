import java.util.Arrays;

public class task14 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {1, 2},
                {1, 2},
                {1, 2},
                {1, 2}
        };
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i][0];
            arr[i][0] = arr[i][1];
            arr[i][1] = a;
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}
