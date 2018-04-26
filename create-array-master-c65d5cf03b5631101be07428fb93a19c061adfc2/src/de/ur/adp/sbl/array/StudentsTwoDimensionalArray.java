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
    private int rows = 3;
    private int columns = 4;


    //Constructor of the StudentsTwoDimensionalArray
    public StudentsTwoDimensionalArray(int rows, int columns) {

        this.rows = rows;
        this.columns = columns;

        //calls the method createArray
        printArray(createArray(rows, columns));


    }

    /* this method creates a new two dimensional array.
    The size of the array is defined by its parameters rows and columns
     */
    private int[][] createArray(int rows, int columns) {

        array = new int[rows][columns];

        array[0][0] = 1;


        //
        for (int i = 0; i < rows - 1; i++) {

            array[i + 1][0] = array[i][0] * 2;

        }


        for (int j = 1; j < columns; j++) {

            array[0][j] = array[0][j - 1] + 3;

            for (int i = 1; i < rows; i++) {

                array[i][j] = array[i - 1][j] * 2;
            }

        }

        return array;

    }

    public void printArray (int[][] array) {
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "").replace("]]", "").replace("[","").replace("]", "").replace(", ",","));
    }

    /* alternative printArray method
    private void printArray (int[][] array){

        for(int i = 0; i < array.length; i++){
            for (int j=0; j < array[i].length; j++){

                if(j != array[i].length - 1)
                    System.out.print(array[i][j] + ",");
                else
                    System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    */


    @Override
    public int getRowAndColumn(int row, int column) {

        return array[row][column];
    }

}


