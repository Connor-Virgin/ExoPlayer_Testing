package com.google.android.exoplayer2.util.coe891_tests;

import com.google.android.exoplayer2.util.Assertions;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;


//needs to be in test package
@RunWith(RobolectricTestRunner.class)
public class AssertionsTest {

  @Test
  public void testIndexISP1(){
    int res, index, start, limit;
    index = 1;
    start = 1;
    limit = 2;
    res = Assertions.checkIndex(index, start, limit);
    assertEquals(index, res);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testIndexISP2(){
    int index, start, limit;
    index = 1;
    start = 1;
    limit = 1;
    Assertions.checkIndex(index, start, limit);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testIndexISP3(){
    int index, start, limit;
    index = 1;
    start = 1;
    limit = 0;
    Assertions.checkIndex(index, start, limit);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testIndexISP4(){
    int index, start, limit;
    index = 1;
    start = 2;
    limit = 2;
    Assertions.checkIndex(index, start, limit);
  }

  @Test
  public void testIndexISP5(){
    int res, index, start, limit;
    index = 2;
    start = 1;
    limit = 3;
    res = Assertions.checkIndex(index, start, limit);
    assertEquals(index, res);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testIndexLBT1(){
    int index, start, limit;
    index = 2;
    start = 1;
    limit = 1;
    Assertions.checkIndex(index, start, limit);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testIndexLBT2(){
    int index, start, limit;
    index = 1;
    start = 2;
    limit = 1;
    Assertions.checkIndex(index, start, limit);
  }

  //needs to be in test package
  @Test(expected = IllegalArgumentException.class)
  public void testEmptyISP1(){
    String string = null;
    Assertions.checkNotEmpty(string);
    fail("null should have produced an exception");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEmptyISP2(){
    String string = "";
    Assertions.checkNotEmpty(string);
    fail("empty string should have produced an exception");
  }

  @Test
  public void testEmptyISP3(){
    String string = "hello world";
    String res;
    res = Assertions.checkNotEmpty(string);
    assertEquals(string, res);
  }


}

