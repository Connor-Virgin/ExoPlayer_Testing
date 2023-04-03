package com.google.android.exoplayer2.util.coe891_tests;

import com.google.android.exoplayer2.util.LongArray;
import org.junit.Assert;
import org.junit.Test;

public class LongArrayTest {

    @Test
    public void testAddISP() {
      LongArray longArray = new LongArray();
      Assert.assertEquals(0, longArray.size());

      longArray.add(1);
      Assert.assertEquals(1, longArray.size());
      Assert.assertEquals(1, longArray.get(0));

      for (int i = 1; i <= 10; i++) {
        Assert.assertEquals(i, longArray.get(i - 1));
      }

      longArray.add(11);
      Assert.assertEquals(11, longArray.size());
      for (int i = 1; i <= 11; i++) {
        Assert.assertEquals(i, longArray.get(i - 1));
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

