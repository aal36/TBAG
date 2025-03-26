package edu.ycp.cs320.lab02.model;

// model class for Numbers
// only the controller should be allowed to call the set methods
// the JSP will call the "get" and "is" methods implicitly
// when the JSP specifies game.min, that gets converted to
//    a call to model.getMin()
// when the JSP specifies if(game.done), that gets converted to
//    a call to model.isDone()
public class Numbers {
    private double num1;
    private double num2;
    private double num3;
    private double result;

    // Constructor to initialize the model
    public Numbers(double num1, double num2, double num3) {
    	this.num1= num1;
    	this.num2= num2;
    	this.num3= num3;
    }
    public Numbers(double num1, double num2) {
    	this.num1= num1;
    	this.num2= num2;
    }
    // Getter and setter methods
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }
    
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
