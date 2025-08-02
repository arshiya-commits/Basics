import java.util.Scanner;

public class Basics {
    public static void main(String args[]) {
        System.out.println("arshiya");
        // datatypes
        byte num = 5;
        System.out.println(num);
        short num1 = 7;
        System.out.println(num1);
        int num2 = 97;
        System.out.println(num2);

        long num3 = 8;
        System.out.println(num3);
        float num4 = 9.9f;
        System.out.println(num4);
        double num5 = 9.807;
        System.out.println(num5);
        char val = 't';
        System.out.println(val);
        boolean values = true;
        System.out.println(values);
        // operators
        // Artheemtic operators
        // +,-,*,/,%
        int nums1 = 2;
        int nums2 = 8;
        int result = nums1 - nums2;
        System.out.println(result);
        // unary operators
        // +,-,++,--
        // -1*-1=1
        int res = -7;
        System.out.println(-res);
        // post incre, pre incre
        // post will store and then incre
        // pre will incre and then assign
        // relational operations
        // ==,>=,<=,<,>
        int var = 9;
        int var2 = 7;

        System.out.println(var == var2);
        // logival &&,||
        // assignmnet--==,+=,-=
        // terinary ?,:
        // strings
        String name = "arshiya ";
        String name3 = "arshiya parveen";
        String name1 = "uzair";
        String names = name + name1;
        System.out.println(names);
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(5));
        System.out.println(name.substring(2, 6));
        System.out.println(name.equals(name1));
        System.out.println(name3.trim());
        // implicit type cast:
        // converting low datatype to higher
        int var8 = 9;
        double var7 = var8;
        System.out.println(var7);
        // explicit typecast
        // higher to lower (lossy conversion)
        double numeric = 9.776;
        int nums7 = (int) numeric;
        System.out.println(nums7);
        // aarays: store same type of datatype:
        // int[] arr = new int[6];
        int[] arr7 = { 1, 23, 3, 45, 67 };
        for (int i = 0; i < arr7.length; i++) {
            System.out.println(arr7[i]);

        }
        // if-else
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18)
            System.out.println("adult");
        else
            System.out.println("not adult");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int j = 0;
        int k = 1;
        while (j < 6) {
            k++;
            j++;
        }
        System.out.println(k);
    }
}
