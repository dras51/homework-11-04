package com.company;

import java.util.Scanner;

public class Task4 {
    public void calculate() {
        System.out.println("Task 4!!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number!");
        int input = scanner.nextInt();
        int mid = input / 2;
        int flag = 0;

        if (input <= 1) {
            System.out.println("I am interrupting work!");
            return;
        }

        for (int i = 2; i <= mid; i++) {
            if (input % i == 0) {
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
