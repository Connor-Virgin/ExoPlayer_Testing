package com.google.android.exoplayer2.util.coe891_tests;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Size;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SizeTest {
  /** Testing Equals() */
  //ISP Test Cases
  @Test //Null Value
  public void testEqualsISP1(){
    Size size = new Size(256,256);
    assertEquals(false,size.equals(null));
  }

  @Test //Same Object
  public void testEqualsISP2(){
    Size size = new Size(256,256);
    assertEquals(true,size.equals(size));
  }

  @Test //Different Equal Object
  public void testEqualsISP3(){
    Size size = new Size(256,256);
    Size size1 = new Size(256,256);
    assertEquals(true,size.equals(size1));
  }
  @Test //Different Unequal Object
  public void testEqualsISP4(){
    Size size = new Size(256,256);
    Size size1 = new Size(1920,1080);
    assertEquals(false,size.equals(size1));
  }

  //CFG Test Cases
  @Test //Null Value
  public void testEqualsCFG1(){
    Size size = new Size(256,256);
    assertEquals(false,size.equals(null));
  }

  @Test //Same Object
  public void testEqualsCFG2(){
    Size size = new Size(256,256);
    assertEquals(true,size.equals(size));
  }

  @Test //Different Equal Object
  public void testEqualsCFG3(){
    Size size = new Size(256,256);
    Size size1 = new Size(256,256);
    assertEquals(true,size.equals(size1));
  }
  @Test //Different Unequal Object
  public void testEqualsCFG4(){
    Size size = new Size(256,256);
    Size size1 = new Size(1920,1080);
    assertEquals(false,size.equals(size1));
  }

  //DFG Test Cases
  @Test //Different Unequal Object
  public void testEqualsDFG1(){
    Size size = new Size(256,256);
    Size size1 = new Size(1920,1080);
    assertEquals(false,size.equals(size1));
  }

  //LBT Test Cases
  @Test //Null Value
  public void testEqualsLBT1(){
    Size size = new Size(256,256);
    assertEquals(false,size.equals(null));
  }

  @Test //Same Object
  public void testEqualsLBT2(){
    Size size = new Size(256,256);
    assertEquals(true,size.equals(size));
  }

  @Test //Different Equal Object
  public void testEqualsLBT3(){
    Size size = new Size(256,256);
    Size size1 = new Size(256,256);
    assertEquals(true,size.equals(size1));
  }
  @Test //Different Unequal Object
  public void testEqualsLBT4(){
    Size size = new Size(256,256);
    Size size1 = new Size(1920,1080);
    assertEquals(false,size.equals(size1));
  }

  /** Testing Constructor for Size() */
  //ISP Test Cases
  @Test(expected = IllegalArgumentException.class)
  public void testSizeISP1() {
    Size size = new Size(-10,-150);
  }
  @Test
  public void testSizeISP2() {
    Size size = new Size(0,0);
    assertEquals(0,size.getWidth());
  }

  @Test
  public void testSizeISP3() {
    Size size = new Size(10,10);
    assertEquals(10,size.getWidth());
  }

  //CFG Test Cases
  @Test(expected = IllegalArgumentException.class)
  public void testSizeCFG1() {
    Size size = new Size(-10,-150);
  }
  @Test
  public void testSizeCFG2() {
    Size size = new Size(10,10);
    assertEquals(10,size.getWidth());
  }

  //DFG Test Cases
  @Test
  public void testSizeDFG1() {
    Size size = new Size(10,10);
    assertEquals(10,size.getWidth());
  }

  //LBT Test Cases
  @Test(expected = IllegalArgumentException.class)
  public void testSizeLBT1() {
    Size size = new Size(-10,-150);
  }
  @Test
  public void testSizeLBT2() {
    Size size = new Size(10,10);
    assertEquals(10,size.getWidth());
  }
}
