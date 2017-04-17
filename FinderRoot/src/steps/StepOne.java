package steps;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import sources.Function;

public class StepOne {
	
	@SuppressWarnings("unused")
	private Integer[] functionInterval = new Integer[2];
	private Function function;
	private List<Integer[]> intervalsWithRoot = new ArrayList<>();
	
	public StepOne(Function function) {
		this.setFunction(function);
	}
	
	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		if (function == null) {
			throw new InvalidParameterException("Invalid function");
		}
		this.function = function;
	}

	public void addIntervalWithRoot(int interval1, int interval2) {
		Integer[] interval = {interval1, interval2};
		
		intervalsWithRoot.add(interval);
	}

	
	

}
