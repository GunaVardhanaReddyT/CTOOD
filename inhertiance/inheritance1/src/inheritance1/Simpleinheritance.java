package inheritance1;
public class Simpleinheritance {
	public static void main(String[] args) {
		B subOb = new B();	
		/* The subclass has access to all public members of
		its superclass. */
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb: ");
		subOb.showij();
		subOb.showk();
		System.out.println();
		System.out.println("Sum of i, j and k in subOb:");
		subOb.sum();
	}
}
