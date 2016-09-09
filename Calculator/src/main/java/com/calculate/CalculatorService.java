/**
 * This class is a CalculatorService
 * that perfroms all the standard calculation operations
 * @author varun
 * @version 1.0.0
 */
package com.calculate;

public class CalculatorService {

	/**
	 * @description: This method adds two numbers
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	/**
	 * @description: This method subtracts second number from first
	 * @param a
	 * @param b
	 * @return
	 */
	public int subtract(int a, int b) {
		int difference = a -b;
		return difference;
	}
	
	/**
	 * @description: This method multiply two numbers
	 * @param a
	 * @param b
	 * @return
	 */
	public int multiply(int a, int b) {
		int product = a*b;
		return product;
	}
	
	/**
	 * @description: This method divide the first number from second number
	 * @param a
	 * @param b
	 * @return
	 */
	public int divide(int a, int b) {
		int divide = a/b;
		return divide;
	}
	
	
	
}
