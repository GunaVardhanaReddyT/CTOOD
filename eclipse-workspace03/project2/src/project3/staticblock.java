package project3;

public class staticblock {
	private static int a;
	 private static int b;
	 static {
	    a = 10;
	    b = 20;
	 }
public static void main(String[] args)
{
	System.out.println("Value of a = " + staticblock.a);
    System.out.println("Value of b = " + staticblock.b);

}
}