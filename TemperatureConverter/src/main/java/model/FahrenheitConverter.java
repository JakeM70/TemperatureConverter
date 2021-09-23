package model;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
public class FahrenheitConverter {
	private double fahrenheit;
	private final int SUBTRACT_NUMBER = 32;
	private final double TIMES_NUMBER = 1.8;
	
	public FahrenheitConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FahrenheitConverter(double fahrenheit) {
		super();
		this.fahrenheit = fahrenheit;
	}

	
	public double getFahrenheit() {
		return fahrenheit;
	}

	
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	
	public int getSUBTRACT_NUMBER() {
		return SUBTRACT_NUMBER;
	}

	
	public double getTIMES_NUMBER() {
		return TIMES_NUMBER;
	}
	
	public double ConversionFormula() {
		double celsius = (fahrenheit-SUBTRACT_NUMBER)*TIMES_NUMBER;
		return celsius;
	}

}
