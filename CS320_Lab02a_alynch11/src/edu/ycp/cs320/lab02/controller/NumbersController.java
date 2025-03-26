 package edu.ycp.cs320.lab02.controller;
import edu.ycp.cs320.lab02.model.GuessingGame;
import edu.ycp.cs320.lab02.model.Numbers;
public class NumbersController {
	private Numbers model;
	public void setModel(Numbers model) {
		this.model = model;
	}
	public void add() {
		model.setResult(model.getNum1()+model.getNum2()+model.getNum3());
	}
	public void multiply() {
		model.setResult(model.getNum1()+model.getNum2());
	}
}
