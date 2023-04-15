package com.exchange;

public class P34_PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }

        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }

    public static void main(String[] args) {
        int digits[] = {1,2,3};
        int[] arr = plusOne(digits);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
