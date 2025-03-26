package edu.ycp.cs320.lab02.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02.model.Numbers;

public class NumbersTest {
    private Numbers model;

    @Before
    public void setUp() {
        model = new Numbers(10,5,8);
    }
    //Used CHATGPT
    @Test
    public void testSetNum1() {
        model.setNum1(5.5);
        assertEquals(5.5, model.getNum1(), 0.001); // Using a small delta for floating point comparison
    }

    @Test
    public void testSetNum2() {
        model.setNum2(10.0);
        assertEquals(10.0, model.getNum2(), 0.001);
    }

    @Test
    public void testSetNum3() {
        model.setNum3(3.3);
        assertEquals(3.3, model.getNum3(), 0.001);
    }

    @Test
    public void testSetResult() {
        model.setResult(100.0);
        assertEquals(100.0, model.getResult(), 0.001);
    }
   @Test
   public void testgetnum1() {
	   assertEquals(10, model.getNum1(),0.001);
   }
   @Test
   public void testgetnum2() {
	   assertEquals(5, model.getNum2(),0.001);
   }
   @Test
   public void testgetnum3() {
	   assertEquals(8, model.getNum3(),0.001);
   }
}