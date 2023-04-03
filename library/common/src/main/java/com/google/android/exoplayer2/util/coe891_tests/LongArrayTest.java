package com.google.android.exoplayer2.util.coe891_tests;

import com.google.android.exoplayer2.util.LongArray;
import org.junit.Assert;
import org.junit.Test;

public class LongArrayTest {

    @Test
    public void testAddISP() {
      LongArray longArray1 = new LongArray();
      Assert.assertEquals(0, longArray1.size());

      LongArray longArray2 = new LongArray();
      longArray2.add(1);
      Assert.assertEquals(1, longArray2.size());
      Assert.assertEquals(1, longArray2.get(0));

      LongArray longArray3 = new LongArray();
      longArray3.add(1);
      longArray3.add(2);
      longArray3.add(3);
      longArray3.add(4);
      longArray3.add(5);
      longArray3.add(6);
      longArray3.add(7);
      longArray3.add(8);
      longArray3.add(9);
      longArray3.add(10);
      Assert.assertEquals(10, longArray3.size());
      for (int i = 1; i <= 10; i++) {
        Assert.assertEquals(i, longArray3.get(i - 1));
      }

      LongArray longArray4 = new LongArray();
      longArray4.add(1);
      longArray4.add(2);
      longArray4.add(3);
      longArray4.add(4);
      longArray4.add(5);
      longArray4.add(6);
      longArray4.add(7);
      longArray4.add(8);
      longArray4.add(9);
      longArray4.add(10);
      longArray4.add(11);
      Assert.assertEquals(11, longArray4.size());
      for (int i = 1; i <= 11; i++) {
        Assert.assertEquals(i, longArray4.get(i - 1));
      }
    }

  @Test
  public void TestAddCFG1() {
    LongArray longArray = new LongArray();
    longArray.add(1);
    longArray.add(2);
    longArray.add(3);
    longArray.add(4);
    Assert.assertEquals(1, longArray.get(0));
    Assert.assertEquals(2, longArray.get(1));
    Assert.assertEquals(3, longArray.get(2));
    Assert.assertEquals(4, longArray.get(3));
  }

  @Test
  public void testAddCFG2() {
    LongArray longArray = new LongArray(2);
    longArray.add(1);
    longArray.add(2);
    longArray.add(3);
    Assert.assertEquals(1, longArray.get(0));
    Assert.assertEquals(2, longArray.get(1));
    Assert.assertEquals(3, longArray.get(2));
  }

  @Test
  public void testAddDFG1() {
    LongArray longArray = new LongArray(5);
    longArray.add(1L);
    longArray.add(2L);
    Assert.assertEquals(1L, longArray.get(0));
    Assert.assertEquals(2L, longArray.get(1));
  }

  @Test
  public void testAddDFG2() {
    LongArray longArray = new LongArray(2);
    longArray.add(1L);
    longArray.add(2L);
    longArray.add(3L);
    Assert.assertEquals(1L, longArray.get(0));
    Assert.assertEquals(2L, longArray.get(1));
    Assert.assertEquals(3L, longArray.get(2));
  }

  @Test
  public void testAddLBT() {
    LongArray longArray = new LongArray();
    longArray.add(1);
    longArray.add(2);
    longArray.add(3);
    longArray.add(4);
    longArray.add(5);
    longArray.add(6);
    Assert.assertEquals(6, longArray.size());
    Assert.assertEquals(1, longArray.get(0));
    Assert.assertEquals(2, longArray.get(1));
    Assert.assertEquals(3, longArray.get(2));
    Assert.assertEquals(4, longArray.get(3));
    Assert.assertEquals(5, longArray.get(4));
    Assert.assertEquals(6, longArray.get(5));
  }

  @Test
  public void testGetISP() {
    LongArray longArray = new LongArray();
    longArray.add(1);
    longArray.add(2);
    longArray.add(3);

    // Test with index 0
    Assert.assertEquals(1, longArray.get(0));

    // Test with index size-1
    Assert.assertEquals(3, longArray.get(longArray.size() - 1));

    // Test with index size
    try {
      longArray.get(longArray.size());
      Assert.fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
      // expected
    }

    // Test with negative index
    try {
      longArray.get(-1);
      Assert.fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
      // expected
    }

    // Test with index >= size
    try {
      longArray.get(longArray.size() + 1);
      Assert.fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
      // expected
    }
  }

  @Test
  public void testGetCFG() {
    LongArray longArray = new LongArray();
    longArray.add(1);
    longArray.add(2);
    longArray.add(3);

    Assert.assertEquals(2, longArray.get(longArray.size() - 2));
    Assert.assertEquals(3, longArray.get(longArray.size() - 1));
  }

  @Test
  public void testGetDFG() {
    LongArray duplicateArray = new LongArray();
    duplicateArray.add(1);
    duplicateArray.add(2);
    duplicateArray.add(2);
    Assert.assertEquals(1, duplicateArray.get(0));
    Assert.assertEquals(2, duplicateArray.get(1));
    Assert.assertEquals(2, duplicateArray.get(2));
  }

  @Test
  public void testGetLBT() {
    LongArray longArray = new LongArray();
    longArray.add(1);
    longArray.add(2);
    longArray.add(3);

    // Test valid indices
    Assert.assertEquals(1, longArray.get(0));
    Assert.assertEquals(2, longArray.get(1));
    Assert.assertEquals(3, longArray.get(2));

    // Test index out of bounds (less than 0)
    try {
      longArray.get(-1);
      Assert.fail("Expected IndexOutOfBoundsException was not thrown");
    } catch (IndexOutOfBoundsException e) {
      Assert.assertEquals("Invalid index -1, size is 3", e.getMessage());
    }

    // Test index out of bounds (equal to size)
    try {
      longArray.get(3);
      Assert.fail("Expected IndexOutOfBoundsException was not thrown");
    } catch (IndexOutOfBoundsException e) {
      Assert.assertEquals("Invalid index 3, size is 3", e.getMessage());
    }

    // Test index out of bounds (greater than size)
    try {
      longArray.get(4);
      Assert.fail("Expected IndexOutOfBoundsException was not thrown");
    } catch (IndexOutOfBoundsException e) {
      Assert.assertEquals("Invalid index 4, size is 3", e.getMessage());
    }
  }


  @Test
  public void testSize() {
    LongArray longArray = new LongArray();
    Assert.assertEquals(0, longArray.size());
    longArray.add(1);
    Assert.assertEquals(1, longArray.size());
    longArray.add(2);
    Assert.assertEquals(2, longArray.size());
  }

  @Test
  public void testToArray() {
    LongArray longArray = new LongArray();
    longArray.add(1);
    longArray.add(2);
    longArray.add(3);
    long[] array = longArray.toArray();
    Assert.assertArrayEquals(new long[]{1, 2, 3}, array);
  }
}

