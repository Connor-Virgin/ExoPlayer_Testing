package com.google.android.exoplayer2.util.coe891_tests;

import android.view.Surface;
import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.util.SurfaceInfo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SurfaceInfoTest {
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

}
