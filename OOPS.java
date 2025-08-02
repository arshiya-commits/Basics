public class OOPS {
    public static void main(String[] args) {
        // calculate the sum of two numbers passed by command line
        // parseInt is a method in Integer wrapper used to convert the string into
        // integer
        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        // int sum = a + b;
        // System.out.println("sum of two numbers" + sum);
        // ---------------------------------------------------------------------------------------------------------
        // displaying the message
        // String name = args[0];
        // System.out.print("Welcome," + name + "!");
        // ------------------------------------------------------------------------------------------------
        // sum of even digit
        // int num = Integer.parseInt(args[0]);
        int num = 245673;
        int sum = 0;
        while (num != 0) {
            // extracting the last digit
            int val = num % 10;
            // finding even or odd
            if (val % 2 == 0) {
                sum += val;
            }
            // remove the last digit
            num = num / 10;
        }

        System.out.println(sum);
    }

}
