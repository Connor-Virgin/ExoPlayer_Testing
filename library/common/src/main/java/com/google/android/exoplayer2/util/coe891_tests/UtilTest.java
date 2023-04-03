package com.google.android.exoplayer2.util.coe891_tests;

import static org.junit.Assert.assertEquals;

import com.google.android.exoplayer2.util.Util;
import org.junit.Test;


public class UtilTest {
  // getMediaDurationForPlayoutDuration Tests
  // ISP Tests
  @Test
  public void testgetMediaDurationForPlayoutDurationISP1(){
    assertEquals(-1.0f, Util.getMediaDurationForPlayoutDuration(-1, 1.5f), 0.01);
  }

  @Test
  public void testgetMediaDurationForPlayoutDurationISP2(){
    assertEquals(0.0f, Util.getMediaDurationForPlayoutDuration(-1, 0.1f), 0.01);
  }

  @Test
  public void testgetMediaDurationForPlayoutDurationISP3(){
    assertEquals(-1.0f, Util.getMediaDurationForPlayoutDuration(-1, 1.0f), 0.01);
  }

  @Test
  public void testgetMediaDurationForPlayoutDurationISP4(){
    assertEquals(0.0f, Util.getMediaDurationForPlayoutDuration(0, 1.5f), 0.01);
  }

  @Test
  public void testgetMediaDurationForPlayoutDurationISP5(){
    assertEquals(2.0f, Util.getMediaDurationForPlayoutDuration(1, 1.5f), 0.01);
  }

  // getPlayoutDurationForMediaDuration Tests
  @Test
  public void testgetPlayoutDurationForMediaDurationISP1(){
    assertEquals(1.0f, Util.getPlayoutDurationForMediaDuration(1, 1.0f), 0.01);
  }

  @Test
  public void testgetPlayoutDurationForMediaDurationISP2(){
    assertEquals(10.0f, Util.getPlayoutDurationForMediaDuration(1, 0.1f), 0.01);
  }

  @Test
  public void testgetPlayoutDurationForMediaDurationISP3(){
    assertEquals(1.0f, Util.getPlayoutDurationForMediaDuration(1, 2.0f), 0.01);
  }

  @Test
  public void testgetPlayoutDurationForMediaDurationISP4(){
    assertEquals(0.0f, Util.getPlayoutDurationForMediaDuration(0, 1.0f), 0.01);
  }

  @Test
  public void testgetPlayoutDurationForMediaDurationISP5(){
    assertEquals(-1.0f, Util.getPlayoutDurationForMediaDuration(-1, 1.0f), 0.01);
  }
}
