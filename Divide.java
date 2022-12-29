
public class Divide extends Binop {

	public Divide(Node l, Node r) {
		super(l, r);
	}
	
	public double eval(double[] values) {
        return lChild.eval(values) / rChild.eval(values);
    }
	
	public String toString() {
		String str = "(" + lChild.toString() + " / " + rChild.toString() + ")";
		return str;
	}

}
