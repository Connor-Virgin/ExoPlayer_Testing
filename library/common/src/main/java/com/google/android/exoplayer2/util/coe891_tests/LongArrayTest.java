package com.google.android.exoplayer2.util.coe891_tests;

import com.google.android.exoplayer2.util.LongArray;
import org.junit.Assert;
import org.junit.Test;

public class LongArrayTest {

  @Test
  public void testAdd() {
    LongArray longArray = new LongArray();
    longArray.add(1);
    longArray.add(2);
    longArray.add(3);
    Assert.assertEquals(1, longArray.get(0));
    Assert.assertEquals(2, longArray.get(1));
    Assert.assertEquals(3, longArray.get(2));
  }

  @Test
  public void testGet() {
    LongArray longArray = new LongArray();
    longArray.add(1);
    longArray.add(2);
    longArray.add(3);
    Assert.assertEquals(1, longArray.get(0));
    Assert.assertEquals(2, longArray.get(1));
    Assert.assertEquals(3, longArray.get(2));
    try {
      longArray.get(3);
      Assert.fail("Expected IndexOutOfBoundsException was not thrown");
    } catch (IndexOutOfBoundsException e) {
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

