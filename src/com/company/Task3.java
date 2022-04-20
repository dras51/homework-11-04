package com.company;

import java.util.Scanner;

public class Task3 {
    public void calculate() {
        System.out.println("Calculate task 3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("please input the number: ");
        int input = scanner.nextInt();

        //Loops through the numbers from 1 to the value before input to print the one that can divide the input without a remainder
        for (int i = 1; i < input; i++) {
            if(input % i == 0) {
                System.out.println(i);
            }
        }
    }
}
