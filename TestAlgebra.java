import java.util.*;

public class TestAlgebra {

	public static void main(String[] args) {
		double [] x = {1, 2, 3};
		double [] y = {4, 5, 6};
		
		System.out.println("When {X0,X1,X2} = {" + x[0] + "," + x[1] + "," + x[2] + "}:");
		randomAlgebra(x);
		System.out.println("When {X0,X1,X2} = {" + y[0] + "," + y[1] + "," + y[2] + "}:");
		randomAlgebra(y);
		System.out.println("When {X0,X1,X2} = {" + x[0] + "," + x[1] + "," + x[2] + "}:");
		randomAlgebra(x);
		System.out.println("When {X0,X1,X2} = {" + y[0] + "," + y[1] + "," + y[2] + "}:");
		randomAlgebra(y);

	}
	
	public static boolean coinFlip() {
		Random r = new Random();
		int coin = r.nextInt(2);
		if (coin == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void randomAlgebra(double [] arr) {
    	Node one, two, three, four;
    	Binop first, second, third;
    	
    	if (coinFlip()) {
    		one = randConst();
    	}else {
    		one = randVariable();
    	}
    	
    	if (coinFlip()) {
    		two = randConst();
    	}else {
    		two = randVariable();
    	}
    	
    	if (coinFlip()) {
    		three = randConst();
    	}else {
    		three = randVariable();
    	}
    	
    	if (coinFlip()) {
    		four = randConst();
    	}else {
    		four = randVariable();
    	}
    	
    	first = randOperator(one, two);
    	second = randOperator(three, four);
    	third = randOperator(first, second);
    	
    	System.out.println(third.toString() + " = " + third.eval(arr));   	
    }
    
    private static Node randVariable() {
    	Random var = new Random();
    	int varIndex = var.nextInt(3);
		return new Variable(varIndex);
	}

	public static Const randConst() {
    	Random randCon = new Random();
    	int constant = randCon.nextInt(20) + 1;
    	return new Const((double)constant);
    }
    
    public static Binop randOperator(Node a, Node b) {
    	Random randOp = new Random();
    	int op = randOp.nextInt(4);
    	
    	if (op == 0) {
    		return new Plus(a, b);
    	} else if (op == 1) {
    		return new Minus(a, b);
    	} else if ( op == 2) {
    		return new Divide(a, b);
    	} else {
    		return new Mult(a, b);
    	}
    }

}
