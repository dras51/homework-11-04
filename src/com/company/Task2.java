package com.company;

import java.util.Scanner;

public class Task2 {
    public void calculate() {
        System.out.println("Task 2");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the amount of numbers to expect");
        int num_of_inputs = scanner.nextInt();

        int[] numbers = new int[num_of_inputs];

        int counter = 0;
        int input;

        //Create a loop that rus for the amount of inputs to expect
        do {
            System.out.println("Input a number to add. or input zero to calculate");
            input = scanner.nextInt();

            //Add int to array
            if (input == 0) {
                break;
            }
            numbers[counter++] = input;
        } while (input != 0 && counter < num_of_inputs);

        int largest = numbers[0];
        int smallest = numbers[0];
        int sum;

        for (int num: numbers){
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }

        sum = largest + smallest;
        double arithmetimetic_mean = sum / 2;

        System.out.println(sum + "is the sum of both the smallest and largest value");
        System.out.println(arithmetimetic_mean + "is the arithmetic mean!");
    }
}
