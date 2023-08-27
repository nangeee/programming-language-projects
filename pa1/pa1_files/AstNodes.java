import java.util.ArrayList;

/*

define Ast Nodes

- Define AST nodes to print
- The nodes have to be defined as class

*/

public class AstNodes{


}

class Prog extends AstNodes{
	public ArrayList<AstNodes> expressions;

	public Prog() {  
		this.expressions = new ArrayList<>();
	}

	public void addExpression(AstNodes e) {
		expressions.add(e);
	}

}


class Number extends AstNodes{
	double num;
	
	public Number(double num) {
		this.num = num;
	}
}

class Variable extends AstNodes {
	String id;

	public Variable(String id) {
		this.id = id;
	}
}


class VariableDeclaration extends AstNodes {
	public String id;
	public double value;

	public VariableDeclaration(String id, double value) {
		this.id = id;
		this.value = value;
	}
}

class minFunction extends AstNodes {
	double left;
	double right;
	
	public minFunction(double left, double right) {
		this.left = left;
		this.right = right;
	}
}

class maxFunction extends AstNodes {
	double left;
	double right;
	
	public maxFunction(double left, double right) {
		this.left = left;
		this.right = right;
	}
}

class powFunction extends AstNodes {
	double left;
	double right;
	
	public powFunction(double left, double right) {
		this.left = left;
		this.right = right;
	}
}

class sqrtFunction extends AstNodes {
	double num;
	
	public sqrtFunction(double num) {
		this.num = num;
	}
}


class Parens extends AstNodes {
	AstNodes exprInParens;
	
	public Parens (AstNodes exprInParens) {
		this.exprInParens = exprInParens;
	}
}

class Addition extends AstNodes {
	AstNodes left;
	AstNodes right;

	public Addition(AstNodes left, AstNodes right) {
		this.left = left;
		this.right = right;
	}
}

class Subtraction extends AstNodes {
	AstNodes left;
	AstNodes right;

	public Subtraction(AstNodes left, AstNodes right) {
		this.left = left;
		this.right = right;
	}
}

class Multiplication extends AstNodes {
	AstNodes left;
	AstNodes right;

    public Multiplication(AstNodes left, AstNodes right) {
      this.left = left;
      this.right = right;
    }
}

class Division extends AstNodes {
	AstNodes left;
	AstNodes right;

	public Division(AstNodes left, AstNodes right) {
		this.left = left;
		this.right = right;
	}
}
