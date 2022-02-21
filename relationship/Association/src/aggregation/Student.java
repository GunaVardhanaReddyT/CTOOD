package aggregation;

public class Student {
  private long id;
  private String name;
  private int mark;
  private float cgpa;
  private Address a;
  //Student(long id, String name, int mark, float cgpa,Address a)
  Student(long id, String name, int mark, float cgpa,String street, String state, String country, long zip) {
	this.id = id;
	this.name = name;
	this.mark = mark;
	this.cgpa = cgpa;
	this.a =new Address(street,state,country,zip);
	//this.a = a;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", cgpa=" + cgpa + ", a=" + a + "]";
}
 
}
