public class maths {
    public static boolean Count(int n) {
        // if (n == 0)
        // return 0;
        // int largest = 0;
        // int count = 0;
        // while (n > 0) {
        // int digit = n % 10;
        // if (digit > largest) {
        // largest = digit;
        // }

        // n = n / 10;

        // }
        // return largest;
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static void main(String args[]) {
        int num = 34567;
        if (Count(num)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}