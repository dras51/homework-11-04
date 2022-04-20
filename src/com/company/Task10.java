package com.company;

import java.util.Arrays;

public class Task10 {
    int[] arr = {6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7, 9, 15, 1};
    int[] arr2 = new int[arr.length - 2];

    int value = 2;

    public void calculate() {
        //Loop through each element in array skipping the first and the last iteration
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1) {
                continue;
            }

            //Multiply the value of the elements with given value and save result to new array
            arr2[i - 1] = arr[i] * value;
        }

        System.out.println(Arrays.toString(arr2));
    }

}
