import java.util.Scanner;

public class SomeMath {

    public static int[] makeNumsInt(String s) {
        int[] nums = new int[5];

        String[] vals = s.split(" ",0);

        if (vals.length != 5) {
            return null;
        }

        for (int i = 0; i < vals.length; i++) {
            nums[i] = Integer.parseInt(vals[i]);
        }

        return nums;
    }

    public static double[] makeNumsDouble(String s) {
        double[] nums = new double[5];

        String[] vals = s.split(" ",0);

        if (vals.length != 5) {
            return null;
        }

        for (int i = 0; i < vals.length; i++) {
            nums[i] = Double.parseDouble(vals[i]);
        }

        return nums;
    }

    public static int total5(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }

    public static double average5(int[] nums) {
        return total5(nums) / nums.length;
    }

    public static double largest5(double[] nums) {
        double largest = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 5 integer numbers, separated by spaces.\n");

        int[] nums = makeNumsInt(scan.nextLine());

        while (nums == null) {
            System.out.println("An error occurred. Please try again.\n");

            System.out.println("Please enter 5 integer numbers, separated by spaces.\n");

            nums = makeNumsInt(scan.nextLine());
        }

        System.out.println("The sum of your numbers is " + total5(nums) + "\n");

        System.out.println("Would you like to input different integer numbers to calculate the average? Type Y for Yes, anything else to continue with the same numbers.\n");

        String answer = scan.nextLine();

        if (answer.compareToIgnoreCase("Y") == 0)  {
            System.out.println("Please enter 5 new integer numbers, separated by spaces.\n");

            nums = makeNumsInt(scan.nextLine());
        }

        System.out.println("The average of your numbers is " + average5(nums) + "\n");

        System.out.println("Please enter 5 double numbers, separated by spaces.\n");

        double[] dubs = makeNumsDouble(scan.nextLine());

        while (dubs == null) {
            System.out.println("An error occurred. Please try again.\n");

            System.out.println("Please enter 5 double numbers, separated by spaces.\n");

            dubs = makeNumsDouble(scan.nextLine());
        }

        System.out.println("The largest of your double numbers is " + largest5(dubs) + "\n");
    }
}
