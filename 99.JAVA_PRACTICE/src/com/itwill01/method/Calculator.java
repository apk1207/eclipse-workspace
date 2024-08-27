package com.itwill01.method;

public class Calculator {
	/*
	 * 4개의 멤버메쏘드를 가짐
	 */
	/*
	 * - add( 두개의 정수를 매개변수로 받아서 더한 결과값을 반환)
	 */
	public int add(int a, int b) {
		return a + b;
	}
	
	/*
	 * - sub( 두개의 정수를 매개변수로 받아서 뺀   결과값을 반환)
	 */
	public int sub(int a, int b) {
		return a - b;
	}
	
	/*
	 * - div( 두개의 정수를 매개변수로 받아서 나눈 결과값을 반환)
	 */
	public int div(int a, int b) {
		return a / b;
	}
	
	/*
	 * - mul( 두개의 정수를 매개변수로 받아서 곱한 결과값을 반환)
	 */
	public int mul(int a, int b) {
		return a * b;
	}
	
}