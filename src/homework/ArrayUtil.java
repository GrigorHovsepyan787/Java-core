package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] nums = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int min = nums[0];
        int oddNums = 0;
        int evenNums = 0;
        int sum = 0;
        double sumD = 0;
        // task 1
        System.out.println("1. The values of the array elements are equal - ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        // task 2
        System.out.println("\n");
        // task 2
        System.out.println("2. The first element in array equals - " + nums[0] + "\n");
        // task 3
        System.out.println("3. The last element in array equals - " + nums[nums.length - 1] + "\n");
        //task 4
        System.out.println("4. The length of array equals - " + nums.length + "\n");
        // task 5
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("5. Minimal value of array equals - " + min + "\n");
        // task 6
        if (nums.length <= 2) {
            System.out.println("6. Can't print middle values." + "\n");
        } else {
            if (nums.length % 2 == 0) {
                System.out.print("6. Middle values for array equal - " + nums[nums.length / 2 - 1] + " ");
                System.out.println(nums[nums.length / 2] + "\n");

            } else {
                System.out.println("6. Middle value for array equals - " + nums[nums.length / 2] + "\n");
            }
        }
        //task 7
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 1) {
                oddNums++;
            } else {
                evenNums++;
            }
        }
        System.out.println("7. Quantity of even numbers in array equal - " + evenNums + "\n");
        //task 8
        System.out.println("8. Quantity of odd numbers in array equal - " + oddNums + "\n");
        //task 9
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("9. The sum of array elements equal - " + sum + "\n");
        // task 10
        sumD = (double) sum / nums.length;
        System.out.println("10. The average value for array equal - " + sumD);
    }
}
