package com.person;

@SuppressWarnings("serial")
public class EmployeeException extends Exception {
	private String field;
	private double invalidValue;

	public EmployeeException() {
		super("Invalid value");
	}

	public EmployeeException(String field, double value) {
		super("Invalid" + " " + field+ ":" + value);
		this.field = field;
		this.invalidValue = value;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public double getInvalidValue() {
		return invalidValue;
	}

	public void setInvalidValue(double invalidValue) {
		this.invalidValue = invalidValue;
	}
}
