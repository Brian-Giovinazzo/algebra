/**
 * Code Template Authors: Dr. Stephen Roehrig
 *                        and David G. Cooper
 * Purpose: A binary operator for Addition
 */
 public class Plus extends Binop {
     /**
      * @param l the left node
      * @param r the right node
      */
    public Plus(Node l, Node r) {
        super(l, r);
    }
    /**
     * @return the result of adding
     * lChild to rChild after each has
     * been evaluated.x
     */
    public double eval(double[] values) {
        return lChild.eval(values) + rChild.eval(values);
    }
    
    public String toString() {
		String str = "(" + lChild.toString() + " + " + rChild.toString() + ")";
		return str;
	}
}