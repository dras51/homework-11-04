package com.company;

public class Task5 {
    int[] table = {6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7, 9, 10, 1};

    public void calculate() {
        //Use loop to iterate over array and print out how many times each number occurs

        for (int i = 1; i <= 10; i++) {

            //Set variable to hold amount of time a number occurs
            int sum = 0;

            //Loop through array to find the amount of time the current number occurs and save the value to sum
            for(int item: table) {
                if (i == item) {
                    sum += 1;
                }
            }

            //Output the value of each iteration 1-10 and the amount of time they occur
            System.out.println(i + " - " + sum);
        }
    }
}
