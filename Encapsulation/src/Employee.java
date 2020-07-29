
public class Employee {
	private int empid;
	private String empname;
	private float empsal;
	public void setempid(int empid) {
		this.empid=empid;
		
	}
	public void setempname(String empname) {
		this.empname=empname;
	}
	public void setempsal(float empsal) {
		this.empsal=empsal;
	}
	public int getempid() {
		return empid;
	}
	public String getempname() {
		return empname;
	}
	public float getempsal() {
		return empsal;
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setempid(22434);
		e.setempname("shareef");
		e.setempsal(32.5f);
		System.out.println(e.getempid());
		System.out.println(e.getempname());
		System.out.println(e.getempsal());
		
		

	}

}
