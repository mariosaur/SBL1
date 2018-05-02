/*
Timo Ruescher 2040853
Lukas Stoeger 2022190
Mario Saur 2022174


 */


package de.ur.adp.sbl.array;


import java.util.Arrays;



public class StudentsTwoDimensionalArray implements TwoDimensionalArray {

    private int array[][];


    //Constructor of the StudentsTwoDimensionalArray
    public StudentsTwoDimensionalArray(int rows, int columns) {

        //defines the size of the two dimensional array with the given rows and columns
        array = new int[rows][columns];

        //the first value of the array is 1
        array[0][0] = 1;


        for (int i = 0; i < columns; i++) {

            if(i != columns - 1) {
                array[0][i + 1] = array[0][i] + 3;
            }

            for (int j = 1; j < rows; j++) {
                array[j][i] = array[j - 1][i] * 2;
            }
        }
    }

    //public void printArray (int[][] array) {

    //System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "").replace("]]", "").replace("[","").replace("]", "").replace(", ",","));

    //}

    @Override
    public int getRowAndColumn(int row, int column) {

        return array[row][column];
    }

}


