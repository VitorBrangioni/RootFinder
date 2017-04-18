package sources;

import java.security.InvalidParameterException;

public class Function {

	private String function;
	private Derivative derivative;

	public Function(String function) {
		this.setFunction(function);
		this.setDerivative(new Derivative(this));
	}

	private boolean functionIsValid(String function) {
		return false;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		if (this.functionIsValid(function)) {
			this.function = function;
		}
		throw new InvalidParameterException("Invalid function");
	}

	public Derivative getderivative() {
		return derivative;
	}

	public void setDerivative(Derivative derivative) {
		this.derivative = derivative;
	}

}
