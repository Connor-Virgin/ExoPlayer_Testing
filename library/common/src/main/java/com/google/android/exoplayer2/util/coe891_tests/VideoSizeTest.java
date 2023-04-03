package com.google.android.exoplayer2.util.coe891_tests;

import static org.junit.Assert.assertEquals;

import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.video.VideoSize;
import org.junit.Test;

public class VideoSizeTest {
  // Equals Method Tests
  // ISP Test cases
  @Test // Null Value
  public void testEqualsISP1() {
    VideoSize videoSize = new VideoSize(1280, 720);
    assertEquals(false, videoSize.equals(null));
  }

  @Test //Same Object
  public void testEqualsISP2(){
    VideoSize videoSize = new VideoSize(1280, 720);
    assertEquals(true, videoSize.equals(videoSize));
  }

  @Test //Same Type Unequal Object
  public void testEqualsISP3(){
    VideoSize videoSize1 = new VideoSize(1280, 720);
    VideoSize videoSize2 = new VideoSize(720, 720);
    assertEquals(false, videoSize1.equals(videoSize2));
  }

  @Test //Same Type Equal Object
  public void testEqualsISP4(){
    VideoSize videoSize1 = new VideoSize(720, 720);
    VideoSize videoSize2 = new VideoSize(720, 720);
    assertEquals(true, videoSize2.equals(videoSize2));
  }

  @Test // Different Type Object
  public void testEqualsISP5() {
    VideoSize videoSize1 = new VideoSize(720, 720);
    Size size = new Size(1280, 720);
    assertEquals(false, videoSize1.equals(size));
  }
}
