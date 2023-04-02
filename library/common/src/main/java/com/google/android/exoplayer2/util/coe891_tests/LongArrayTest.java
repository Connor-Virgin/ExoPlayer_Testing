package com.google.android.exoplayer2.util.coe891_tests;

import com.google.android.exoplayer2.util.LongArray;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LongArrayTest {

  private LongArray longArray;

  @Before
  public void setUp() {
    longArray = new LongArray();
  }

  @Test
  public void testAddAndGet() {
    longArray.add(1);
    longArray.add(2);
    longArray.add(3);

    assertEquals(3, longArray.size());
    assertEquals(1, longArray.get(0));
    assertEquals(2, longArray.get(1));
    assertEquals(3, longArray.get(2));
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testGetInvalidIndex() {
    longArray.get(0); // This should throw an exception because the array is empty
  }

}
