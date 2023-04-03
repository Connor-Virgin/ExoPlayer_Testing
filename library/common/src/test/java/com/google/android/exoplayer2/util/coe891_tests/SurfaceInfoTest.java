package com.google.android.exoplayer2.util.coe891_tests;

import android.view.Surface;
import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.util.SurfaceInfo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SurfaceInfoTest {
  // Equals Method Tests
  // ISP Test cases
  @Test // Null Value
  public void testEqualsISP1(){
    //SurfaceTexture surfaceTexture = new SurfaceTexture(0);
    SurfaceInfo surfaceInfo = new SurfaceInfo(1280, 720, 0);
    assertEquals(false, surfaceInfo.equals(null));
  }

  @Test //Same Object
  public void testEqualsISP2(){
    SurfaceInfo surfaceInfo = new SurfaceInfo(1280, 720, 0);
    assertEquals(true, surfaceInfo.equals(surfaceInfo));
  }

  @Test //Same Type Unequal Object
  public void testEqualsISP3(){
    SurfaceInfo surfaceInfo1 = new SurfaceInfo(1280, 720, 0);
    SurfaceInfo surfaceInfo2 = new SurfaceInfo(720, 720, 0);
    assertEquals(false, surfaceInfo1.equals(surfaceInfo2));
  }

  @Test //Same Type Equal Object
  public void testEqualsISP4(){
    SurfaceInfo surfaceInfo1 = new SurfaceInfo(1280, 720, 0);
    SurfaceInfo surfaceInfo2 = new SurfaceInfo(1280, 720, 0);
    assertEquals(true, surfaceInfo1.equals(surfaceInfo2));
  }

  @Test // Different Type Object
  public void testEqualsISP5() {
    SurfaceInfo surfaceInfo1 = new SurfaceInfo(1280, 720, 0);
    Size size = new Size(1280, 720);
    assertEquals(false, surfaceInfo1.equals(size));
  }

  // CFG Tests
  @Test // Same Object
  public void testEqualsCFG1() {
    SurfaceInfo surfaceInfo = new SurfaceInfo(1280, 720, 0);
    assertEquals(true, surfaceInfo.equals(surfaceInfo));
  }

  @Test // Same Type
  public void testEqualsCFG2() {
    SurfaceInfo surfaceInfo1 = new SurfaceInfo(1280, 720, 0);
    SurfaceInfo surfaceInfo2 = new SurfaceInfo(1280, 720, 0);
    assertEquals(true, surfaceInfo1.equals(surfaceInfo2));

    SurfaceInfo surfaceInfo3 = new SurfaceInfo(1280, 720, 0);
    SurfaceInfo surfaceInfo4 = new SurfaceInfo(720, 720, 0);
    assertEquals(false, surfaceInfo3.equals(surfaceInfo4));
  }

  @Test // Different Type
  public void testEqualsCFG3() {
    SurfaceInfo surfaceInfo1 = new SurfaceInfo(1280, 720, 0);
    Size size = new Size(1280, 720);
    assertEquals(false, surfaceInfo1.equals(size));
  }

  // DFG Tests
  @Test
  public void testEqualsDFG1() {
    SurfaceInfo surfaceInfo1 = new SurfaceInfo(1280, 720, 0);
    SurfaceInfo surfaceInfo2 = new SurfaceInfo(7323, 3428, 0);
    assertEquals(false, surfaceInfo1.equals(surfaceInfo2));
  }

  // LBT Tests
  @Test // Same Object
  public void testEqualsLBT1() {
    SurfaceInfo surfaceInfo = new SurfaceInfo(1280, 720, 0);
    assertEquals(true, surfaceInfo.equals(surfaceInfo));
  }

  @Test // Same Type
  public void testEqualsLBT2() {
    SurfaceInfo surfaceInfo1 = new SurfaceInfo(1280, 720, 0);
    SurfaceInfo surfaceInfo2 = new SurfaceInfo(1280, 720, 0);
    assertEquals(true, surfaceInfo1.equals(surfaceInfo2));
  }
}
