package Calculator;
import java.io.Serializable;
import java.util.Scanner;

// class needs to be public for Pojo
public class Calculator implements Serializable, Interface {
//	attributes private because it's a POJO class
	private double inputOne;
	private double inputTwo;
	private String operation;
	
//	public Calculator constructor
//	when you have a Pojo you NEED one constructor without parameters
	public Calculator() {
		this.inputOne = 0;
		this.inputTwo = 0;
		this.operation = "+";
	}
	
//	second constructor
	public Calculator(double inputOne, double inputTwo, String operation) {
		this.inputOne = inputOne;
		this.inputTwo = inputTwo;
		this.operation = operation;
	}
	
	public double performOperation() {
		if(operation == "+") {
			return this.inputOne + this.inputTwo;
		}
		else if(operation == "-") {
			return this.inputOne - this.inputTwo;
		}
		else if(operation == "*") {
			return this.inputOne * this.inputTwo;
		}
		else {
			return this.inputOne / this.inputTwo;
		}
	}
	
	public double getResult() {
		double result = this.performOperation();
		System.out.print(result + "\r");
		return result;
	}
}
