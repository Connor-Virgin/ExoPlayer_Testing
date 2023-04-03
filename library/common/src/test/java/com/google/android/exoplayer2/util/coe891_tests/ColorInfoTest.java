package com.google.android.exoplayer2.util.coe891_tests;

import static org.junit.Assert.assertEquals;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.video.ColorInfo;
import org.junit.Test;

public class ColorInfoTest {
  // Equals Method Tests
  // ISP Test cases
  @Test // Null Value
  public void testEqualsISP1(){
    //SurfaceTexture surfaceTexture = new SurfaceTexture(0);
    ColorInfo colorInfo = new ColorInfo(C.COLOR_SPACE_BT601, C.COLOR_RANGE_LIMITED, C.COLOR_TRANSFER_SDR, null);
    assertEquals(false, colorInfo.equals(null));
  }

  @Test //Same Object
  public void testEqualsISP2(){
    ColorInfo colorInfo = new ColorInfo(C.COLOR_SPACE_BT601, C.COLOR_RANGE_LIMITED, C.COLOR_TRANSFER_SDR, null);
    assertEquals(true, colorInfo.equals(colorInfo));
  }

  @Test //Same Type Unequal Object
  public void testEqualsISP3(){
    ColorInfo colorInfo1 = new ColorInfo(C.COLOR_SPACE_BT601, C.COLOR_RANGE_LIMITED, C.COLOR_TRANSFER_SDR, null);
    ColorInfo colorInfo2 = new ColorInfo(C.COLOR_SPACE_BT709, C.COLOR_RANGE_FULL, C.COLOR_TRANSFER_SDR, null);
    assertEquals(false, colorInfo1.equals(colorInfo2));
  }

  @Test //Same Type Equal Object
  public void testEqualsISP4(){
    ColorInfo colorInfo1 = new ColorInfo(C.COLOR_SPACE_BT601, C.COLOR_RANGE_LIMITED, C.COLOR_TRANSFER_SDR, null);
    ColorInfo colorInfo2 = new ColorInfo(C.COLOR_SPACE_BT601, C.COLOR_RANGE_LIMITED, C.COLOR_TRANSFER_SDR, null);
    assertEquals(true, colorInfo1.equals(colorInfo2));
  }

  @Test // Different Type Object
  public void testEqualsISP5() {
    ColorInfo colorInfo1 = new ColorInfo(C.COLOR_SPACE_BT601, C.COLOR_RANGE_LIMITED, C.COLOR_TRANSFER_SDR, null);
    Size size = new Size(1280, 720);
    assertEquals(false, colorInfo1.equals(size));
  }
/*
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
 */
}
