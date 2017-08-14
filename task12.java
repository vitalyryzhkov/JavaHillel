public class task12 {
    public static void main(String[] args) {
        int a = 123321;
        String s = String.valueOf(a);
        int[] arr = new int[s.length()];
        boolean isPalindrome = true;

        for (int i = 0; i < s.length(); i++) {
            arr[i] = a % 10;
            a /= 10;
        }

        for (int j = s.length() - 1, i = 0; j >= 0; j--, i++) {
            if (isEquals(arr[j], arr[i])) {
                System.out.println("Digit is not palindrome");
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Digit is palindrome");
        }
    }

    public static boolean isEquals(int a, int b) {
        if (a != b) {
            return true;
        }
        return false;
    }
}
