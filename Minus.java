
public class Minus extends Binop {

	public Minus(Node l, Node r) {
		super(l, r);
	}
	
	public double eval(double[] values) {
        return lChild.eval(values) - rChild.eval(values);
    }

	public String toString() {
		String str = "(" + lChild.toString() + " - " + rChild.toString() + ")";
		return str;
	}
}
