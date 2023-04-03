package com.google.android.exoplayer2.util.coe891_tests;

import com.google.android.exoplayer2.util.FlagSet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class FlagSetTest {
  //Add Test Methods
  @Test
  public void testAddISP1() {
    FlagSet flags = new FlagSet.Builder().add(5).build();
    assertTrue(flags.contains(5));
  }

  @Test
  public void testAddISP2() {
    FlagSet flags = new FlagSet.Builder().add(Integer.MAX_VALUE).build();
    assertTrue(flags.contains(Integer.MAX_VALUE));
  }

  @Test
  public void testAddISP3() {
    FlagSet flags = new FlagSet.Builder().add(Integer.MIN_VALUE).build();
    assertTrue(flags.contains(Integer.MIN_VALUE));
  }

  @Test
  public void testAddISP4() {
    FlagSet flags = new FlagSet.Builder().add(0).build();
    assertTrue(flags.contains(0));
  }

  //AddIf Test Methods
  @Test
  public void testAddIfISP1() {
    FlagSet flags = new FlagSet.Builder().addIf(5, true).build();
    assertTrue(flags.contains(5));
  }

  @Test
  public void testAddIfISP2() {
    FlagSet flags = new FlagSet.Builder().addIf(5, false).build();
    assertFalse(flags.contains(5));
  }

  @Test
  public void testAddIfISP3() {
    FlagSet flags = new FlagSet.Builder().addIf(Integer.MAX_VALUE, true).build();
    assertTrue(flags.contains(Integer.MAX_VALUE));
  }

  @Test
  public void testAddIfISP4() {
    FlagSet flags = new FlagSet.Builder().addIf(Integer.MIN_VALUE, true).build();
    assertTrue(flags.contains(Integer.MIN_VALUE));
  }

  @Test
  public void testAddIfISP5() {
    FlagSet flags = new FlagSet.Builder().addIf(0, true).build();
    assertTrue(flags.contains(0));
  }

  //remove Test methods
  @Test
  public void testRemoveISP1() {
    FlagSet flags = new FlagSet.Builder().add(0).add(1).add(2).remove(1).build();
    assertFalse(flags.contains(1));
  }

  @Test
  public void testRemoveISP2() {
    FlagSet flags = new FlagSet.Builder().add(0).add(Integer.MIN_VALUE).add(2).remove(Integer.MIN_VALUE).build();
    assertFalse(flags.contains(Integer.MIN_VALUE));
  }

  @Test
  public void testRemoveISP3() {
    FlagSet flags = new FlagSet.Builder().add(0).add(1).add(2).remove(0).build();
    assertFalse(flags.contains(0));
  }

  @Test
  public void testRemoveISP4() {
    FlagSet flags = new FlagSet.Builder().add(0).add(Integer.MAX_VALUE).add(2).remove(Integer.MAX_VALUE).build();
    assertFalse(flags.contains(Integer.MAX_VALUE));
  }

  //removeIf Test Methods
  @Test
  public void testRemoveIfISP1() {
    FlagSet flags = new FlagSet.Builder().add(0).add(1).add(2).removeIf(1, true).build();
    assertFalse(flags.contains(1));
  }

  @Test
  public void testRemoveIfISP2() {
    FlagSet flags = new FlagSet.Builder().add(0).add(1).add(2).removeIf(1, false).build();
    assertTrue(flags.contains(1));
  }

  @Test
  public void testRemoveIfISP3() {
    FlagSet flags = new FlagSet.Builder().add(0).add(Integer.MIN_VALUE).add(2).removeIf(Integer.MIN_VALUE, true).build();
    assertFalse(flags.contains(1));
  }

  @Test
  public void testRemoveIfISP4() {
    FlagSet flags = new FlagSet.Builder().add(0).add(1).add(2).removeIf(0, true).build();
    assertFalse(flags.contains(0));
  }

  @Test
  public void testRemoveIfISP5() {
    FlagSet flags = new FlagSet.Builder().add(0).add(Integer.MAX_VALUE).add(2).removeIf(Integer.MAX_VALUE, true).build();
    assertFalse(flags.contains(Integer.MAX_VALUE));
  }
}
