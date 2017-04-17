package sources;

import java.security.InvalidParameterException;

public class Derivative {

	private String derivativeExpression;
	private Function function;
	
	public Derivative(Function function) {
		this.setFunction(function);
		this.setDerivative(this.generateDerivative());
	}
	
	private String generateDerivative() {
		
		return null;
	}

	public String getDerivative() {
		return derivativeExpression;
	}

	public void setDerivative(String derivative) {
		if (derivative == null) {
			throw new InvalidParameterException();
		}
		this.derivativeExpression = derivative;
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
