public class task13 {
    public static void main(String[] args) {
        int[][] arrD = new int[10][10];
        int sumElemArrays = 0;
        int stringSum = 0;
        int minElem = arrD[0][0];
        int maxElem = arrD[0][0];
        int countPositiveElements = 0;

        for (int i = 0; i < arrD.length; i++) {
            for (int j = 0; j < arrD[i].length; j++) {
                arrD[i][j] = (int) (Math.random() * 41) - 20;
                sumElemArrays += arrD[i][j];
                stringSum += arrD[i][j];

                if (minElem > arrD[i][j]) {
                    minElem = arrD[i][j];
                }
                if (maxElem < arrD[i][j]) {
                    maxElem = arrD[i][j];
                }

                if (arrD[i][j] > 0) {
                    countPositiveElements++;
                }
            }
            System.out.println("Sum of array string number " + (i + 1) + ": " + stringSum +
                    "\n min element: " + minElem + "\n max element: " + maxElem);
            stringSum = 0;
        }
        newprint();
        System.out.println("min element: " + minElem);
        newprint();
        System.out.println("max element: " + maxElem);
        newprint();
        System.out.println("Count of positive elements: " + countPositiveElements);
        newprint();
        System.out.println("Average value of the array: " + sumElemArrays / (arrD.length * arrD[0].length));
        newprint();
        System.out.print("Sum of the all elem of array: " + sumElemArrays);
    }

    public static void newprint() {
        System.out.println(String.format("%44s", "").replace(' ', '='));
    }
}
