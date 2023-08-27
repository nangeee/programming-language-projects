import java.util.ArrayList;
import java.util.List;

/*

Build Ast using the method in ExprBaseVisitor.java 
you should override the methods.

*/


public class BuildAstVisitor extends ExprBaseVisitor<AstNodes>{
	
	private List<String> vars; // to store variables declared
	
	public BuildAstVisitor() {
		vars = new ArrayList<>();
	}

	@Override 
	public AstNodes visitProg(ExprParser.ProgContext ctx) { 
		Prog prog = new Prog();

		// helper visitor for transforming each subtree
		// into an AstNodes object
		BuildAstVisitor exprVisitor = new BuildAstVisitor();

		for (int i = 0;i < ctx.getChildCount(); i++) {
			if (i == ctx.getChildCount() - 1) {
			// do not visit the last child of start symbol prog
			// and attempt to convert it to an AstNodes object
			}
			else {
				prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
			}
		}
		return prog;
	}
	
	@Override 
	public AstNodes visitInfixExpr(ExprParser.InfixExprContext ctx) { 
		AstNodes astNode = new AstNodes();
		AstNodes left = visit(ctx.getChild(0)); // recursively visit the left subtree of the current InfixExpr node
		AstNodes right = visit(ctx.getChild(2));
		String operator = ctx.getChild(1).getText();

		if (operator.equals("+")) {
			return new Addition(left, right);
		}
		else if (operator.equals("-")) {
			return new Subtraction(left, right);
		}
		else if (operator.equals("*")) {
			return new Multiplication(left, right);
		}
		else if (operator.equals("/")) {
			return new Division(left, right);
		}
		
		return astNode;
	}
	
	@Override 
	public AstNodes visitFunctionCall(ExprParser.FunctionCallContext ctx) { 
		AstNodes astNode = new AstNodes();
		String leftText = ctx.getChild(2).getText();
		double left = Double.parseDouble(leftText);
		String rightText;
		double right;

		if (ctx.getChildCount() > 4) {
			rightText = ctx.getChild(4).getText();
			right = Double.parseDouble(rightText);
		}
		else {
			rightText = "";
			right = 0;
		}

		String functionName = ctx.getChild(0).getText();
		
		if (functionName.equals("min")) {
			return new minFunction(left, right);
		} else if (functionName.equals("max")) {
			return new maxFunction(left, right);
		} else if (functionName.equals("pow")) {
			return new powFunction(left, right);
		} else if (functionName.equals("sqrt")) {
			return new sqrtFunction(left);
		}
		
		return astNode;
	}
	
	@Override 
	public AstNodes visitParensExpr(ExprParser.ParensExprContext ctx) { 
		AstNodes exprInParens = visit(ctx.getChild(1));

		return new Parens(exprInParens);	
	}
	
	@Override 
	public AstNodes visitNumberExpr(ExprParser.NumberExprContext ctx) { 
		String numText = ctx.getChild(0).getText(); // pass index to getChild
		double num = Double.parseDouble(numText);
		return new Number(num);	
	}
	
	@Override 
	public AstNodes visitVarDec(ExprParser.VarDecContext ctx) { 
		String id = ctx.getChild(0).getText();
		if (!vars.contains(id)) { 
			vars.add(id);	
		}
		double value = Double.parseDouble(ctx.getChild(2).getText());
		return new VariableDeclaration(id, value);
	}
	
	@Override 
	public AstNodes visitIdExpr(ExprParser.IdExprContext ctx) {
       		String id = ctx.getChild(0).getText();
		return new Variable(id);	
	}
	
	@Override 
	public AstNodes visitNum(ExprParser.NumContext ctx) { 
		return super.visitNum(ctx);
	}
    
}
