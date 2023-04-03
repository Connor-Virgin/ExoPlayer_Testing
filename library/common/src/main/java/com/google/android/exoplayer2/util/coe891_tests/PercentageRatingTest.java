package com.google.android.exoplayer2.util.coe891_tests;
import com.google.android.exoplayer2.PercentageRating;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PercentageRatingTest {

  //ISP Test Cases
  @Test //Null Value
  public void testEqualsISP1(){
    PercentageRating percentRating = new PercentageRating(50);
    assertEquals(false,percentRating.equals(null));
  }

  @Test //Same Object
  public void testEqualsISP2(){
    PercentageRating percentRating = new PercentageRating(50);
    assertEquals(true,percentRating.equals(percentRating));
  }

  @Test //Same Type unequal object
  public void testEqualsISP3(){
    PercentageRating percentRating = new PercentageRating(50);
    PercentageRating percentRating1 = new PercentageRating(100);
    assertEquals(false,percentRating.equals(percentRating1));
  }

  @Test //Same Type equal object
  public void testEqualsISP4(){
    PercentageRating percentRating = new PercentageRating(50);
    PercentageRating percentRating1 = new PercentageRating(50);
    assertEquals(true,percentRating.equals(percentRating1));
  }

  @Test //Not Same Type
  public void testEqualsISP5(){
    PercentageRating percentRating = new PercentageRating(50);
    ArrayList list = new ArrayList();
    assertEquals(false,percentRating.equals(list));
  }

  //CFG Test Cases
  @Test //Not Same Type
  public void testEqualsCFG1(){
    PercentageRating percentRating = new PercentageRating(50);
    ArrayList list = new ArrayList();
    assertEquals(false,percentRating.equals(list));
  }

  @Test //Same Object
  public void testEqualsCFG2(){
    PercentageRating percentRating = new PercentageRating(50);
    assertEquals(true,percentRating.equals(percentRating));
  }

  //DFG Test Cases
  @Test //Same Object
  public void testEqualsDFG1(){
    PercentageRating percentRating = new PercentageRating(50);
    assertEquals(true,percentRating.equals(percentRating));
  }

  //LBT Test Cases
  @Test //Null Value
  public void testEqualsLBT1(){
    PercentageRating percentRating = new PercentageRating(50);
    assertEquals(false,percentRating.equals(null));
  }

  @Test //Same Object
  public void testEqualsLBT2(){
    PercentageRating percentRating = new PercentageRating(50);
    assertEquals(true,percentRating.equals(percentRating));
  }

  @Test //Same Type unequal object
  public void testEqualsLBT3(){
    PercentageRating percentRating = new PercentageRating(50);
    PercentageRating percentRating1 = new PercentageRating(100);
    assertEquals(false,percentRating.equals(percentRating1));
  }
}