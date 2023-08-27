import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


/*

- Define the main method in the file

- In the main method, 
  1) Build parse tree
  2) Accept input as command line
  3) Call the method as defined (call and evaluate)
  4) Print out the resulting value
  ** Calculation should be in double (5/2 = 2.5, not 2)
  ** ctrl + d after your enter input

*/

public class program {

    public static void main(String[] args) throws IOException {

        // Get Lexer
        ExprLexer lexer = new ExprLexer(CharStreams.fromStream(System.in));
        
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass tokens to parser
        ExprParser parser = new ExprParser(tokens);
        
	// write your code here
        // tell ANTLR to build a parse tree
     	// parse from the start symbol 'prog'
        ParseTree antlrAST = parser.prog();
        
        // create a visitor for converting the parse tree
     	// into AstNodes objects
        BuildAstVisitor progVisitor = new BuildAstVisitor();
     	Prog prog = (Prog) progVisitor.visit(antlrAST);
     	
     	
     	// Print out the AST nodes
     	AstCall caller = new AstCall(prog.expressions);
     	caller.PrintNode();
     	

     	// Print out resulting values using evaluate method 
		Evaluate ep = new Evaluate(prog.expressions);	
		for (Double evaluation: ep.evaluate()) {
			System.out.println(evaluation);
		}
    }
}
