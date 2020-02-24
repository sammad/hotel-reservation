package com.ms.hotel_reservation.resources;

import java.util.List;

public class Calculation {

	private List<String> input;
	private List<String> output;
	private String operation;
	public Calculation(List<String> input, List<String> output, String operation) {
		super();
		this.input = input;
		this.output = output;
		this.operation = operation;
	}
	public List<String> getInput() {
		return input;
	}
	public void setInput(List<String> input) {
		this.input = input;
	}
	public List<String> getOutput() {
		return output;
	}
	public void setOutput(List<String> output) {
		this.output = output;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
}
