package aggregation1;

public class Adhar {
	 private long adharno;

	public Adhar(long adharno) {
		this.adharno = adharno;
	}

	@Override
	public String toString() {
		return "Adhar [adharno=" + adharno + "]";
	}
	 
	boolean dob()
	{
		System.out.println("this displys the dob");
		return true;
	}
	
}
