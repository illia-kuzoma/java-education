package com.wellnessliving.lesson2.MoveZeroes;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        printArray(nums);
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
