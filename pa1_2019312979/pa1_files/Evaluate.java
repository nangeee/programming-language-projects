import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*

Calculate The Input String
And Return the result

- Define methods to calculate the expression we get as input
- The name of the method should be "evaluate"

*/


class Evaluate {


	List<AstNodes> list;
	/* Symbol table for storing values of variables */
	public Map<String, Double> values; 
	
	public Evaluate(List<AstNodes> list) {
		this.list = list;
		values = new HashMap<>();
	}

	public List<Double> evaluate() {
		List<Double> evaluations = new ArrayList<>();
		
		for (AstNodes e: list) {
			if (e instanceof VariableDeclaration) { // e is an instance of VariableDeclaration
				VariableDeclaration decl = (VariableDeclaration) e;
				values.put(decl.id, decl.value);
				evaluations.add(0.0);
			}
			else if (e instanceof AstNodes){ // e is not an instance of VariableDeclaration
				double result = getEvalResult(e);
				evaluations.add(result);
			}
		}

		return evaluations;
	}

	
	private double getEvalResult(AstNodes e) {
		double result = 0;

		if (e instanceof Number) {
			Number num = (Number) e;
			result = num.num;
		}
		else if (e instanceof Variable){
			Variable variable = (Variable) e;
			result = values.get(variable.id);
		}
		else if (e instanceof Parens) {
			Parens parens = (Parens) e;
			result = getEvalResult(parens.exprInParens);
		}
		else if (e instanceof maxFunction) {
			maxFunction maxFunct = (maxFunction) e;
			double left = maxFunct.left;
			double right = maxFunct.right;
			result = Math.max(left, right);
		}
		else if (e instanceof minFunction) {
			minFunction minFunct = (minFunction) e;
			double left = minFunct.left;
			double right = minFunct.right;
			result = Math.min(left, right);
		}
		else if (e instanceof powFunction) {
			powFunction powFunct = (powFunction) e;
			double left = powFunct.left;
			double right = powFunct.right;
			result = Math.pow(left, right);
		}
		else if (e instanceof sqrtFunction) {
			sqrtFunction sqrtFunct = (sqrtFunction) e;
			double num = sqrtFunct.num;
			result = Math.sqrt(num);
		}
		else if (e instanceof Addition) {
			Addition add = (Addition) e;
			double left = getEvalResult(add.left);
			double right = getEvalResult(add.right);
			result = left + right;
		}
		else if (e instanceof Subtraction){
			Subtraction sub = (Subtraction) e;
			double left = getEvalResult(sub.left);
			double right = getEvalResult(sub.right);
			result = left - right;
		}
		else if (e instanceof Multiplication) {
			Multiplication mul = (Multiplication) e;
			double left = getEvalResult(mul.left);
			double right = getEvalResult(mul.right);
			result = left * right;
		}
		else if (e instanceof Division) {
			Division div = (Division) e;
			double left = getEvalResult(div.left);
			double right = getEvalResult(div.right);
			result = left / right;
		}
		
		return result;

	}
}