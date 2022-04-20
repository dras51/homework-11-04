package com.company;

public class Task8 {
    int[] array = {1, 2, 4, 5, 6 };
    int value = 6;


    public void calculate() {
        //Loop through each element in the array
        //loop though the other elements to see which one would be added to the first loop iteration to get the target value
        for(int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] + array[j] == value) {
                    System.out.println(array[i] + ", " + array[j] +  " are the numbers in the array that would be added to get " + value);
                }
            }
        }
    }
}
