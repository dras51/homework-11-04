package com.company;

public class Task7 {
    int largest;
    int smallest;
    int[] arr = {6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7, 9, 15, 1};

    public void calculate() {
        largest = arr[0];
        smallest = arr[0];

        for(int num: arr) {
            if(num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        int difference = largest - smallest;

        System.out.println("The difference between the largest and the smallest value is: " + difference);
    }
}
