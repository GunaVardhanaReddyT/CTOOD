package p2;

public class innerclass {

	public static void main(String[] args) {
		Outer ob=new Outer();
		//creating object for inner class
		Outer.inner in=ob.new inner();
		in.msg(12);
		//anonymous inner class
		Inner in1=new Inner()
				{
			void msg() {
				System.out.println("this is anonyomous");
			}
				};
				in1.msg();
		Outer1 ob1=new Outer1();
		ob1.display();
		//nested static class
		Outer2.Inner obj=new Outer2.Inner();  
		  obj.msg();  

	}

}
