package homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        // Ուզել էի շատ սորտերի ձևեր գրեի, որ սիրուն տեսք ունենա ամեն սորտը որպես մեթոդ գրեցի
        int[] nums = {5, 6, 3, 9, 2, 1, 7};
        bubble(nums);
        selection(nums);
        quick(nums);
    }

    public static void bubble(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void selection(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp > nums[j]) {
                    temp = nums[j];
                }
            }
            nums[i] = temp;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void quick(int[]nums){
        Arrays.stream(nums).sorted(); // stream api-ով է որոշեցի գրել, ավելի օպտիմիզացված ու հեշտ ձևը
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
