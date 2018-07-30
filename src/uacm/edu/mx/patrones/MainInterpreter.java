package uacm.edu.mx.patrones;

import java.util.ArrayList;
import java.util.Iterator;

public class MainInterpreter {

	public static void main(String[] args) {
		String numromano = "IX";
		Context context = new Context(numromano);
		
		ArrayList<Expression> tree = new ArrayList<Expression>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new OneExpression());
		
		
		//Se interpreta
		Iterator<Expression> ite = tree.iterator();
		while(ite.hasNext()){
			Expression exp = ite.next();
			exp.interpret(context);
		}
		
		System.out.println(context.output);
	}
}
