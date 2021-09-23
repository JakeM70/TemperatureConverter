package model;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
public class CelsiusConverter {
	private double celsius;
	private final double TIMES_NUMBER = 1.8000;
	private final int ADD_NUMBER = 32;
	
	public CelsiusConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CelsiusConverter(double celsius) {
		super();
		this.celsius = celsius;
	}

	
	public double getCelsius() {
		return celsius;
	}

	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	
	public double getTIMES_NUMBER() {
		return TIMES_NUMBER;
	}

	
	public int getADD_NUMBER() {
		return ADD_NUMBER;
	}
	
	public double ConversionFormula() {
		
		double fahrenheit = (celsius*TIMES_NUMBER) + ADD_NUMBER;
		return fahrenheit;
	}
	
	

}
