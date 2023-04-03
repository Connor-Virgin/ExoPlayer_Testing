package com.google.android.exoplayer2.util.coe891_tests;

import com.google.android.exoplayer2.util.Assertions;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

//needs to be in test package
//@RunWith(RobolectricTestRunner.class)
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
    int res, index, start, limit;
    index = 1;
    start = 1;
    limit = 1;
    res = Assertions.checkIndex(index, start, limit);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testIndexISP3(){
    int res, index, start, limit;
    index = 1;
    start = 1;
    limit = 0;
    res = Assertions.checkIndex(index, start, limit);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testIndexISP4(){
    int res, index, start, limit;
    index = 1;
    start = 2;
    limit = 2;
    res = Assertions.checkIndex(index, start, limit);
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
    int res, index, start, limit;
    index = 2;
    start = 1;
    limit = 1;
    res = Assertions.checkIndex(index, start, limit);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testIndexLBT2(){
    int res, index, start, limit;
    index = 1;
    start = 2;
    limit = 1;
    res = Assertions.checkIndex(index, start, limit);
  }

  //needs to be in test package
//  @Test(expected = IllegalArgumentException.class)
//  public void testEmptyISP1(){
//    String string = null;
//    String res;
//    res = Assertions.checkNotEmpty(string);
//  }
//
//  @Test(expected = IllegalArgumentException.class)
//  public void testEmptyISP2(){
//    String string = "";
//    String res;
//    res = Assertions.checkNotEmpty(string);
//  }
//
//  @Test
//  public void testEmptyISP3(){
//    String string = "hello world";
//    String res;
//    res = Assertions.checkNotEmpty(string);
//    assertEquals(string, res);
//  }
}
