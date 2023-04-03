package com.google.android.exoplayer2.util.coe891_tests;
import com.google.android.exoplayer2.ThumbRating;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ThumbRatingTest {

  //ISP Test Cases
  @Test //Null Value
  public void testEqualsISP1(){
    ThumbRating thumbRating = new ThumbRating(true);
    assertEquals(false,thumbRating.equals(null));
  }

  @Test //Same Object
  public void testEqualsISP2(){
    ThumbRating thumbRating = new ThumbRating(true);
    assertEquals(true,thumbRating.equals(thumbRating));
  }

  @Test //Same Type unequal object
  public void testEqualsISP3(){
    ThumbRating thumbRating = new ThumbRating(true);
    ThumbRating thumbRating1 = new ThumbRating(false);
    assertEquals(false,thumbRating.equals(thumbRating1));
  }

  @Test //Same Type equal object
  public void testEqualsISP4(){
    ThumbRating thumbRating = new ThumbRating(true);
    ThumbRating thumbRating1 = new ThumbRating(true);
    assertEquals(true,thumbRating.equals(thumbRating1));
  }

  @Test //Not Same Type
  public void testEqualsISP5(){
    ThumbRating thumbRating = new ThumbRating(true);
    ArrayList list = new ArrayList();
    assertEquals(false,thumbRating.equals(list));
  }

  //CFG Test Cases
  @Test //Not Same Type
  public void testEqualsCFG1(){
    ThumbRating thumbRating = new ThumbRating(true);
    ArrayList list = new ArrayList();
    assertEquals(false,thumbRating.equals(list));
  }

  @Test //Same Object
  public void testEqualsCFG2(){
    ThumbRating thumbRating = new ThumbRating(true);
    assertEquals(true,thumbRating.equals(thumbRating));
  }

  //DFG Test Cases
  @Test //Same Object
  public void testEqualsDFG1(){
    ThumbRating thumbRating = new ThumbRating(true);
    assertEquals(true,thumbRating.equals(thumbRating));
  }

  //LBT Test Cases
  @Test //Null Value
  public void testEqualsLBT1(){
    ThumbRating thumbRating = new ThumbRating(true);
    assertEquals(false,thumbRating.equals(null));
  }

  @Test //Same Object
  public void testEqualsLBT2(){
    ThumbRating thumbRating = new ThumbRating(true);
    assertEquals(true,thumbRating.equals(thumbRating));
  }

  @Test //Same Type unequal object
  public void testEqualsLBT3(){
    ThumbRating thumbRating = new ThumbRating(true);
    ThumbRating thumbRating1 = new ThumbRating(false);
    assertEquals(false,thumbRating.equals(thumbRating1));
  }
}
