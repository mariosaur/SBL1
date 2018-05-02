/*
Timo Ruescher 2040853
Lukas Stoeger 2022190
Mario Saur 2022174


 */


package de.ur.adp.sbl.array;


import java.util.Arrays;

/**
 * This class should return an array like
 * <p>
 * 1,4,7,10
 * 2,8,14,20
 * 4,16,28,40
 */

public class StudentsTwoDimensionalArray implements TwoDimensionalArray {

    private int array[][];


    //Constructor of the StudentsTwoDimensionalArray
    public StudentsTwoDimensionalArray(int rows, int columns) {

        array = new int[rows][columns];
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

    /* this method creates a new two dimensional array.
    The size of the array is defined by its parameters rows and columns


    public void printArray (int[][] array) {
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "").replace("]]", "").replace("[","").replace("]", "").replace(", ",","));
    }

*/

    @Override
    public int getRowAndColumn(int row, int column) {

        return array[row][column];
    }

}


