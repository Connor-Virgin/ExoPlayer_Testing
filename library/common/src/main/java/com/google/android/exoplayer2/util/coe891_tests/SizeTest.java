package com.google.android.exoplayer2.util.coe891_tests;
import com.google.android.exoplayer2.util.Size;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SizeTest {
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

  //ISP Test Cases
  @Test //Null Value
  public void testSizeISP1(){
    Size size = new Size(256,256);
    assertEquals(false,size.equals(null));
  }

}
