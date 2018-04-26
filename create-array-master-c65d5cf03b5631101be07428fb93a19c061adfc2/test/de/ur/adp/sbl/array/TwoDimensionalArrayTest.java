package de.ur.adp.sbl.array;


import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TwoDimensionalArrayTest {

  private static final int MAX_TESTS = 8;

  @Test
  public void testWith3RowsAnd4Columns() {
    final int rows = 3;
    final int columns = 4;

    TwoDimensionalArray twoDimensionalArray = new StudentsTwoDimensionalArray(rows, columns);
    System.out.println(twoDimensionalArray);

    // test up to max test fields
    for (int i = 0; i < MAX_TESTS; i++) {
      int testRow = randomFrom(rows);
      int testColumn = randomFrom(columns);

      System.out.printf("Testing field [%d,%d]%n", testRow, testColumn);

      int calculatedFieldValue = twoDimensionalArray.getRowAndColumn(testRow, testColumn);
      int expectedValue = calculateValue(testRow, testColumn);
      assertEquals(String.format("field[%d,%d]", testRow, testColumn), expectedValue, calculatedFieldValue);
    }

  }


  /* DO NOT CHANGE */

  private final int calculateValue(final int row, final int column) {
    return ((((column << 1) + column) + (256 >> 8)) * (1 << row));
  }

  private final int randomFrom(int max) {
    return new Random().ints(1, 0, max).findFirst().getAsInt();
  }

}