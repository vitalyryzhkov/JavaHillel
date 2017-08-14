public class task15 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        int sum = 0;
        int[] arr1 = new int[arr.length];
        int max = arr1[0];
        int idx = arr1[0];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
                arr1[i] = sum;
                if (max < arr1[i]) {
                    max = arr1[i];
                    idx = i;
                }
            }
            System.out.print("The sum of the elements in the column number " + (i + 1) + ": = " + sum);
            sum = 0;
            System.out.println();
        }
        System.out.println("Maximum amount in column number: " + (idx + 1));
    }
}
