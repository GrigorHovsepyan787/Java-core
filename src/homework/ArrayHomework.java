package homework;


public class ArrayHomework {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int n = 6;
        int equals = 0;
        int sumD = 0;
        int[] equal = new int[nums.length];
        String text = "բարևաշխարհ";
        char[] chars = text.toCharArray();
        String textD = "աէըիօւ"; // ու-ն ուրիշ ձևվի 2 սիմվոլ է
        char[] charsD = textD.toCharArray();
        // Task 1
        for (int i : nums) {
            if (i == n) { // i == 6 Ելի որ կստացվի, բայց խնդրի մեյջ կար n = 6
                sum++;
            }
        }
        System.out.println("The quantity of numbers that equals to n are - " + sum);

        //Task 2

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //Task 3
        for (int i : nums) {
            equal[i]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (equal[i] > 1) {
                equals++;
            }
        }
        System.out.println("The quantity of equals in array is - " + equals);

        //Task 4
        for (char i : chars) {
            for (char j : charsD) {
                if (i == j) {
                    sumD++;
                }
            }
        }
        //Զուտ անմիջապես char-Երի մասիվի մեջ ներմուծելով սիմվոլները կխաոներ, էդ պատճաոով String-ը ToCharArray Դարձրի, նոր աշխատավ
        System.out.println("The quantity of vowels in array equals - " + sumD);
    }
}
