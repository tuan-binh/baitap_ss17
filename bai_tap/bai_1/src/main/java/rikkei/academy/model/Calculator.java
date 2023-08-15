package rikkei.academy.model;

public class Calculator {
	private int number1;
	private String operator;
	private int number2;
	
	public Calculator() {
	}
	
	public Calculator(int number1, String operator, int number2) {
		this.number1 = number1;
		this.operator = operator;
		this.number2 = number2;
	}
	
	public int getNumber1() {
		return number1;
	}
	
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	
	public String getOperator() {
		return operator;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public int getNumber2() {
		return number2;
	}
	
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public double run() {
		double result = 0;
		switch (operator) {
			case "+":
				result = number1 + number2;
				break;
			case "-":
				result = number1 - number2;
				break;
			case "*":
				result = number1 * number2;
				break;
			case "/":
				result = number1 / number2;
				break;
			default:
				break;
		}
		return result;
	}
	
}
