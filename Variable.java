
public class Variable extends Node{

	private int index;
	
	public Variable(int i) {
        index = i;
    }
	
	public double eval(double[] values) {
		// TODO Auto-generated method stub
		return values[index];
	}
	
	public String toString() {
		return "X" + index;
	}

}
