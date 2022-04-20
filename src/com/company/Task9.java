package com.company;

public class Task9 {
    int[] table = {49, 50, 1, 3, 200, 2, 4, 70, 5, 13, 11, 12};
    int maxCounter = 1;
    int counter;

    public void calculate() {
        sort(table);
        for(int i = 0; i < table.length; i++){
            counter = 1;
            int temp = table[i];

            //Loop through other elements in the array to find if there is a sequence
            for (int j = i + 1; j < table.length; j++) {
                if(table[j] == temp + 1) {
                    counter++;
                    temp++;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
            }
        }

        System.out.println(maxCounter);
    }

    public void sort(int[] array){
        //Iterate over the array and insert each item in the right position
        //We start with i = 1 because we cannot compare the first value to any other item
        for (int i = 1; i < array.length; i++) {
            int current = array[i];

            //Declare J to represent the number of sorted items in the list
            int j;
            for (j = i; j > 0 && array[j - 1] > current; j--) {
                array[j] = array[j - 1]; //Move the higher value to the right
            } //After first iteration j = 0
            array[j] = current;
        }
    }
}
