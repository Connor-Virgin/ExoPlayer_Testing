package com.google.android.exoplayer2.util.coe891_tests;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
public class ParsableBitArrayTest {
  private byte[] testData;

  @Before
  public void setUp(){
    testData = createByteArray(0x5A, 0xDB, 0xE7, 0xF4, 0x08, 0xFF, 0x5F, 0x10, 0xE3, 0x08);
  }
  //skipBit Test Methods
  @Test
  public void testSkipBitISP1(){
    ParsableBitArray testArray = new ParsableBitArray(testData);

    testArray.setPosition(1);
    testArray.skipBit();

    assertEquals(0x6B, testArray.readBits(8));
  }

  @Test
  public void testSkipBitISP2(){
    ParsableBitArray testArray = new ParsableBitArray(testData);

    testArray.setPosition(7);
    testArray.skipBit();

    assertEquals(0xDB, testArray.readBits(8));
  }

  @Test(expected = IllegalStateException.class)
  public void testSkipBitISP3(){
    ParsableBitArray testArray = new ParsableBitArray(testData);

    testArray.setPosition(80);
    testArray.skipBit();

    fail();
  }

  //skipBits Test Methods
  @Test
  public void testSkipBitsISP1(){
    ParsableBitArray testArray = new ParsableBitArray(testData);

    testArray.setPosition(0);
    testArray.skipBits(2);

    assertEquals(0x6B, testArray.readBits(8));
  }

  @Test
  public void testSkipBitsISP2(){
    ParsableBitArray testArray = new ParsableBitArray(testData);

    testArray.setPosition(4);
    testArray.skipBits(4);

    assertEquals(0xDB, testArray.readBits(8));
  }

  @Test(expected = IllegalStateException.class)
  public void testSkipBitsISP3(){
    ParsableBitArray testArray = new ParsableBitArray(testData);

    testArray.setPosition(80);
    testArray.skipBits(4);

    fail();
  }

  //skipBytes Test Method
  @Test
  public void testSkipBytesISP1(){
    ParsableBitArray testArray = new ParsableBitArray(testData);

    testArray.skipBytes(5);

    assertEquals(0xFF, testArray.readBits(8));
  }

  @Test
  public void testSkipBytesISP2(){
    ParsableBitArray testArray = new ParsableBitArray(testData);

    testArray.skipBytes(0);

    assertEquals(0x5A, testArray.readBits(8));
  }

  @Test(expected = IllegalStateException.class)
  public void testSkipBytesISP3(){
    ParsableBitArray testArray = new ParsableBitArray(testData);

    testArray.skipBytes(11);

    fail();
  }

  //Sourced from existing test class
  private static byte[] createByteArray(int... bytes) {
    byte[] byteArray = new byte[bytes.length];
    for (int i = 0; i < byteArray.length; i++) {
      Assertions.checkState(0x00 <= bytes[i] && bytes[i] <= 0xFF);
      byteArray[i] = (byte) bytes[i];
    }
    return byteArray;
  }
}
