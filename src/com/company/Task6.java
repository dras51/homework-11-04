package com.company;

public class Task6 {
    int[] table = {6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7, 9, 10, 1};
    int[] table2 = new int[table.length];

    //Loop through each element in the array
    //Set the current element to a variable current to track if that element is a duplicate
    //Loop through the array comparing the current element value with the other values to check if there is a duplicate
    //check if current item already exists in the duplicate array. and skip iteration if it does
    //Add duplicate element to new array that stores numbers that are duplicates.

    public void calculate() {

        //Loop through each item in the array
        for (int i = 0; i < table.length; i++) {

            //Set current item to variable current
            int current = table[i];

            //Loop though other items in the array to determine if theres a duplicate
            for (int j = i + 1; j < table.length; j++) {

                //Check if current item exists in array of duplicate items and exit loop if true meaning we don't want
                //To have more than one values of the duplicated item
                if(contains(table2, current)) {
                    break;
                }

                //Check if current item is a duplicate and print message to console if yes. and also add item to new array.
                if(current == table[j]) { //Check if current is a duplicate
                    System.out.println(current + " is a duplicate!");
                    table2[i] = current;
                }
            }
        }
    }

    //Method that helps check if an element is present in an array
    public boolean contains(int[] array, int key) {

        //Loops through array
        for (int i: array) {

            //Check if key passed is equal to any element in array and return true if true
            if (i == key) {
                return true;
            }
        }

        //After loop is completed and nothing is returned then key doesn't exist in array so return false.
        return false;
    }
}
