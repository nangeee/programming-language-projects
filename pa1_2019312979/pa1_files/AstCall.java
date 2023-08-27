import java.util.ArrayList;
import java.util.List;

/*

print the Ast that we build in BuildAstVisitor.java

- Define the methods to print the AST nodes
- The name of the method should be "Call"

*/


public class AstCall {

	List<AstNodes> list;
	int nodeCnt = 0;
	String base = String.format("%8s", " ");
	
	public AstCall(List<AstNodes> list) {
		this.list = list;
	}

	public void PrintNode() {


		for (AstNodes e: list) {
			String result = "";
			if (e instanceof VariableDeclaration) { // e is an instance of VariableDeclaration
				result += CallVarDecNode((VariableDeclaration) e);
			}
			else if (e instanceof Number) {
				result += CallNumNode((Number) e);
			}
			else if (e instanceof Parens) {
				result += CallParensNode((Parens) e);
			}
			else if (e instanceof minFunction) {
				result += CallMinFunct((minFunction) e);
			}
			else if (e instanceof maxFunction) {
				result += CallMaxFunct((maxFunction) e);
			}
			else if (e instanceof powFunction) {
				result += CallPowFunct((powFunction) e);
			}
			else if (e instanceof sqrtFunction) {
				result += CallSqrtFunct((sqrtFunction) e);
			}
			else if (e instanceof Addition) {
				result += CallAddNode((Addition) e);
			}
			else if (e instanceof Subtraction) {
				result += CallSubNode((Subtraction) e);
			}
			else if (e instanceof Multiplication) {
				result += CallMulNode((Multiplication) e);
			}
			else if (e instanceof Division) {
				result += CallDivNode((Division) e);
			}
			else { 
				continue;
			}

			
			System.out.println(result);
			nodeCnt = 0;
		}

	}
	
	private String CallVarDecNode(VariableDeclaration e) {
		VariableDeclaration decl = (VariableDeclaration) e;
		String result = String.format("%-8s\n%-8s%-8s\n%-8s%-8s", "ASSIGN", " ", decl.id, " ", 
				decl.value + "");

		return result;
	}
	
	private String CallVarNode(Variable e) {
		Variable variable = (Variable) e;
		return variable.id;
	}
	
	private String CallNumNode(Number e) {
		Number num = (Number) e;
		return num.num + "";
	}
	
	private String CallParensNode(Parens e) {
		Parens parens = (Parens) e;
		AstNodes exprInParens = parens.exprInParens;
		
		return GetLeftStr(exprInParens);
	}
	
	private String CallMinFunct(minFunction e) {
		minFunction minFunct = (minFunction) e;
		String spaces = "";
		nodeCnt++;
		for (int i = 0;i < nodeCnt;i++)
			spaces += base;
		
		return String.format("%-8s\n%-8s%-8s\n%-8s%-8s", "min", spaces, minFunct.left, spaces, minFunct.right);
	}
	
	private String CallMaxFunct(maxFunction e) {
		maxFunction maxFunct = (maxFunction) e;
		String spaces = "";
		nodeCnt++;
		for (int i = 0;i < nodeCnt;i++)
			spaces += base;
		
		return String.format("%-8s\n%-8s%-8s\n%-8s%-8s", "max", spaces, maxFunct.left, spaces, maxFunct.right);
	}
	
	private String CallPowFunct(powFunction e) {
		powFunction powFunct = (powFunction) e;
		String spaces = "";
		nodeCnt++;
		for (int i = 0;i < nodeCnt;i++)
			spaces += base;
		
		return String.format("%-8s\n%-8s%-8s\n%-8s%-8s", "pow", spaces, powFunct.left, spaces, powFunct.right);
	}
	
	private String CallSqrtFunct(sqrtFunction e) {
		sqrtFunction sqrtFunct = (sqrtFunction) e;
		String spaces = "";
		nodeCnt++;
		for (int i = 0;i < nodeCnt;i++)
			spaces += base;
		
		return String.format("%-8s\n%-8s%-8s", "sqrt", spaces, sqrtFunct.num);
	}
	
	private String CallAddNode(Addition e) {
		Addition add = (Addition) e;
		AstNodes leftNode = add.left;
		AstNodes rightNode = add.right;
		String leftStr = "";
		String rightStr = "";
		String spaces = "";
		
		nodeCnt++;
		for (int i = 0;i < nodeCnt;i++)
			spaces += base;
		int temp = nodeCnt;
		leftStr = GetLeftStr(leftNode);
		nodeCnt = temp;
		rightStr = GetRightStr(rightNode);

		return String.format("%-8s\n%-8s%-8s\n%-8s%-8s", "ADD", spaces, leftStr, spaces, rightStr);
	}
	
	private String CallSubNode(Subtraction e) {
		Subtraction sub = (Subtraction) e;
		AstNodes leftNode = sub.left;
		AstNodes rightNode = sub.right;
		String leftStr = "";
		String rightStr = "";
		String spaces = "";
		
		nodeCnt++;
		for (int i = 0;i < nodeCnt;i++)
			spaces += base;
		int temp = nodeCnt;
		leftStr = GetLeftStr(leftNode);
		nodeCnt = temp;
		rightStr = GetRightStr(rightNode);
		
		return String.format("%-8s\n%-8s%-8s\n%-8s%-8s", "SUB", spaces, leftStr, spaces, rightStr);
	}
	
	private String CallMulNode(Multiplication e) {
		Multiplication mul = (Multiplication) e;
		AstNodes leftNode = mul.left;
		AstNodes rightNode = mul.right;
		String leftStr = "";
		String rightStr = "";
		String spaces = "";
		
		nodeCnt++;
		for (int i = 0;i < nodeCnt;i++)
			spaces += base;
		int temp = nodeCnt;
		leftStr = GetLeftStr(leftNode);
		nodeCnt = temp;
		rightStr = GetRightStr(rightNode);
		
		return String.format("%-8s\n%s%-8s\n%s%-8s", "MUL", spaces, leftStr, spaces, rightStr);
	}
	
	private String CallDivNode(Division e) {
		Division div = (Division) e;
		AstNodes leftNode = div.left;
		AstNodes rightNode = div.right;
		String leftStr = "";
		String rightStr = "";
		String spaces = "";
		
		nodeCnt++;
		for (int i = 0;i < nodeCnt;i++)
			spaces += base;
		int temp = nodeCnt;
		leftStr = GetLeftStr(leftNode);
		nodeCnt = temp;
		rightStr = GetRightStr(rightNode);
		
		return String.format("%-8s\n%-8s%-8s\n%-8s%-8s", "DIV", spaces, leftStr, spaces, rightStr);
	}
	
	
	private String GetLeftStr(AstNodes e) {
		AstNodes leftNode = e;
		String leftStr = "";
		
		if (leftNode instanceof Number) leftStr += CallNumNode((Number) leftNode);
		else if (leftNode instanceof Variable) leftStr += CallVarNode((Variable) leftNode);
		else if (leftNode instanceof Parens) leftStr += CallParensNode((Parens) leftNode);
		else if (leftNode instanceof minFunction) leftStr += CallMinFunct((minFunction) leftNode);
		else if (leftNode instanceof maxFunction) leftStr += CallMaxFunct((maxFunction) leftNode);
		else if (leftNode instanceof powFunction) leftStr += CallPowFunct((powFunction) leftNode);
		else if (leftNode instanceof sqrtFunction) leftStr += CallSqrtFunct((sqrtFunction) leftNode);
		else if (leftNode instanceof Addition) leftStr += CallAddNode((Addition) leftNode);
		else if (leftNode instanceof Subtraction) leftStr += CallSubNode((Subtraction) leftNode);
		else if (leftNode instanceof Multiplication) leftStr += CallMulNode((Multiplication) leftNode);
		else if (leftNode instanceof Division) leftStr += CallDivNode((Division) leftNode);
	
		return leftStr;
	}
	
	private String GetRightStr(AstNodes e) {
		AstNodes rightNode = e;
		String rightStr = "";
		
		if (rightNode instanceof Number) rightStr += CallNumNode((Number) rightNode);
		else if (rightNode instanceof Variable) rightStr += CallVarNode((Variable) rightNode);
		else if (rightNode instanceof Parens) rightStr += CallParensNode((Parens) rightNode);
		else if (rightNode instanceof minFunction) rightStr += CallMinFunct((minFunction) rightNode);
		else if (rightNode instanceof maxFunction) rightStr += CallMaxFunct((maxFunction) rightNode);
		else if (rightNode instanceof powFunction) rightStr += CallPowFunct((powFunction) rightNode);
		else if (rightNode instanceof sqrtFunction) rightStr += CallSqrtFunct((sqrtFunction) rightNode);
		else if (rightNode instanceof Addition) rightStr += CallAddNode((Addition) rightNode);
		else if (rightNode instanceof Subtraction) rightStr += CallSubNode((Subtraction) rightNode);
		else if (rightNode instanceof Multiplication) rightStr += CallMulNode((Multiplication) rightNode);
		else if (rightNode instanceof Division) rightStr += CallDivNode((Division) rightNode);
		
		return rightStr;
	}
    
}
