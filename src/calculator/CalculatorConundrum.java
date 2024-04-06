package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

class CalculatorConundrum {
	private Map<String, BiFunction<Integer, Integer, Integer>> operations;

	public CalculatorConundrum(){
		operations = new HashMap<>();
		operations.put("+", (a, b) -> a + b);
		operations.put("*", (a, b) -> a * b);
		operations.put("/", (a, b) -> a / b);
	}
	public String calculate(int operand1, int operand2, String operation) {
		int result = 0;
		if(operation == null)
			throw new IllegalArgumentException("Operation cannot be null");
		if(operation.isEmpty())
			throw new IllegalArgumentException("Operation cannot be empty");
		if(!operations.containsKey(operation))
			throw new IllegalOperationException ("Operation '" + operation + "' does not exist");
		try {
			result = operations.get(operation).apply(operand1, operand2);
		}
		catch (ArithmeticException e){
			if(operation.equals("/") && operand2 == 0) {
				throw new IllegalOperationException("Division by zero is not allowed", e);
			}
		}
		return operand1 + " " + operation + " " + operand2 + " = " +
				operations.get(operation).apply(operand1, operand2);
	}
}

