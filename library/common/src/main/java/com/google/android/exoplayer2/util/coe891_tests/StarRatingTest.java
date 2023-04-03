package com.google.android.exoplayer2.util.coe891_tests;
import com.google.android.exoplayer2.StarRating;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StarRatingTest {

  //ISP Test Cases
  @Test //Null Value
  public void testEqualsISP1(){
    StarRating starRating = new StarRating(5);
    assertEquals(false,starRating.equals(null));
  }

  @Test //Same Object
  public void testEqualsISP2(){
    StarRating starRating = new StarRating(5);
    assertEquals(true,starRating.equals(starRating));
  }

  @Test //Same Type unequal object
  public void testEqualsISP3(){
    StarRating starRating = new StarRating(5);
    StarRating starRating1 = new StarRating(4);
    assertEquals(false,starRating.equals(starRating1));
  }

  @Test //Same Type equal object
  public void testEqualsISP4(){
    StarRating starRating = new StarRating(5);
    StarRating starRating1 = new StarRating(5);
    assertEquals(true,starRating.equals(starRating1));
  }

  @Test //Not Same Type
  public void testEqualsISP5(){
    StarRating starRating = new StarRating(5);
    ArrayList list = new ArrayList();
    assertEquals(false,starRating.equals(list));
  }

  //CFG Test Cases
  @Test //Not Same Type
  public void testEqualsCFG1(){
    StarRating starRating = new StarRating(5);
    ArrayList list = new ArrayList();
    assertEquals(false,starRating.equals(list));
  }

  @Test //Same Object
  public void testEqualsCFG2(){
    StarRating starRating = new StarRating(5);
    assertEquals(true,starRating.equals(starRating));
  }

  //DFG Test Cases
  @Test //Same Object
  public void testEqualsDFG1(){
    StarRating starRating = new StarRating(5);
    assertEquals(true,starRating.equals(starRating));
  }

  //LBT Test Cases
  @Test //Null Value
  public void testEqualsLBT1(){
    StarRating starRating = new StarRating(5);
    assertEquals(false,starRating.equals(null));
  }

  @Test //Same Object
  public void testEqualsLBT2(){
    StarRating starRating = new StarRating(5);
    assertEquals(true,starRating.equals(starRating));
  }

  @Test //Same Type unequal object
  public void testEqualsLBT3(){
    StarRating starRating = new StarRating(5);
    StarRating starRating1 = new StarRating(4);
    assertEquals(false,starRating.equals(starRating1));
  }
}
