package edu.ycp.cs320.lab02.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02.controller.NumbersController;
import edu.ycp.cs320.lab02.model.Numbers;
public class NumbersControllerTest {
    private NumbersController controller;
    private Numbers model;
    //Used CHATGPT
    @Before
    public void setUp() {
        controller = new NumbersController();
        model = new Numbers(10,5,8);
        controller.setModel(model);
    }

    @Test
    public void testAdd() {
        controller.add();
        assertEquals(23, model.getResult(), 0.001); // Delta is needed for floating-point comparison
    }

    @Test
    public void testMultiply() {
       controller.multiply();
        assertEquals(50, model.getResult(), 0.001); // Delta for floating-point precision
    }
}