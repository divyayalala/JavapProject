package collection;

//comparable is used for single sorting logic
//comparator is used when we want sort on multiple logics
public class Emp implements Comparable<Emp>{
      private String name;
      private String phoneno;
      private int empid;
	public Emp(String name, String phoneno, int empid) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phoneno=" + phoneno + ", empid=" + empid + "]";
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	} 
}
