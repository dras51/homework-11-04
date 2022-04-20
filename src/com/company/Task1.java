package com.company;

import java.util.Scanner;

public class Task1 {

    public void calculate() {
        System.out.println("Task 1");
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int input;

        do {
            System.out.println("Input a number to add. input 0 to calculate sum.");
            input = scanner.nextInt();
            total = total + input;
        } while (input != 0);

        System.out.println(total);
    }
}
