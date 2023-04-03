package com.google.android.exoplayer2.util.coe891_tests;
import com.google.android.exoplayer2.HeartRating;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HeartRatingTest {

  //ISP Test Cases
  @Test //Null Value
  public void testEqualsISP1(){
    HeartRating heartRating = new HeartRating(true);
    assertEquals(false,heartRating.equals(null));
  }

  @Test //Same Object
  public void testEqualsISP2(){
    HeartRating heartRating = new HeartRating(true);
    assertEquals(true,heartRating.equals(heartRating));
  }

  @Test //Same Type unequal object
  public void testEqualsISP3(){
    HeartRating heartRating = new HeartRating(true);
    HeartRating heartRating1 = new HeartRating(false);
    assertEquals(false,heartRating.equals(heartRating1));
  }

  @Test //Same Type equal object
  public void testEqualsISP4(){
    HeartRating heartRating = new HeartRating(true);
    HeartRating heartRating1 = new HeartRating(true);
    assertEquals(true,heartRating.equals(heartRating1));
  }

  @Test //Not Same Type
  public void testEqualsISP5(){
    HeartRating heartRating = new HeartRating(true);
    ArrayList list = new ArrayList();
    assertEquals(false,heartRating.equals(list));
  }

  //CFG Test Cases
  @Test //Not Same Type
  public void testEqualsCFG1(){
    HeartRating heartRating = new HeartRating(true);
    ArrayList list = new ArrayList();
    assertEquals(false,heartRating.equals(list));
  }

  @Test //Same Object
  public void testEqualsCFG2(){
    HeartRating heartRating = new HeartRating(true);
    assertEquals(true,heartRating.equals(heartRating));
  }

  //DFG Test Cases
  @Test //Same Object
  public void testEqualsDFG1(){
    HeartRating heartRating = new HeartRating(true);
    assertEquals(true,heartRating.equals(heartRating));
  }

  //LBT Test Cases
  @Test //Null Value
  public void testEqualsLBT1(){
    HeartRating heartRating = new HeartRating(true);
    assertEquals(false,heartRating.equals(null));
  }

  @Test //Same Object
  public void testEqualsLBT2(){
    HeartRating heartRating = new HeartRating(true);
    assertEquals(true,heartRating.equals(heartRating));
  }

  @Test //Same Type unequal object
  public void testEqualsLBT3(){
    HeartRating heartRating = new HeartRating(true);
    HeartRating heartRating1 = new HeartRating(false);
    assertEquals(false,heartRating.equals(heartRating1));
  }
}
