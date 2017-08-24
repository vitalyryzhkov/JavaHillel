import java.util.Arrays;

public class task16 {
    public static void main(String[] args) {
        int[] arr = new int[(int) (Math.random() * 10 + 1) + 10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(arr));
        int find = arr[7];

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {

                int temp;
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        findVal(arr, find);
//        System.out.println("num = " + find);
    }

    public static int findVal(int[] arr, int num) {
        int left = 0;
        int right = arr.length;
        int middle = (left + right) / 2;
        boolean result = false;
        while (!result) {
//        for (int i = 0; i < right; i++) {
            middle = (left + right) / 2;
            if (num == arr[middle]) {
                System.out.println("Index of the desired number = " + middle);
                result = true;
            } else if (num < arr[middle]) {
                right = middle - 1;
                middle = (left + right) / 2;

            } else if (num > arr[middle]) {
                left = middle + 1;
                middle = (left + right) / 2;

            }
        }
//        }
        return arr[middle];
    }
}
