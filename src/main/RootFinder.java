package main;

import java.security.InvalidParameterException;

import sources.Function;

public class RootFinder {

	private Function function;
	
	public RootFinder(Function function) {
		this.setFunction(function);
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		if (function == null) {
			throw new InvalidParameterException();
		}
		this.function = function;
	}
}
