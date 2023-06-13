package one;
enum gender{
	F,M;
}
class Personcls2{
	private String firstName;
	private String lastName;
	private String phoneNum;
	gender gen;
	Personcls2(){
		System.out.println("default constructor");
	}
	public Personcls2(String firstName, String lastName,String phoneNum,gender gen) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.gen = gen;
	}
	public gender getGen() {
		return gen;
	}
	public void setGen(gender gen) {
		this.gen = gen;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void getDetails() {
		System.out.println("FirstName: "+firstName);
		System.out.println("LasttName: "+lastName);
		System.out.println("Gender: "+gen);
		System.out.println("PhoneNum: "+phoneNum);
	}
}

public class OneEight {

	public static void main(String[] args) {
		Personcls2 p1 = new Personcls2("Divya","Yalala","7386270454",gender.F);
		Personcls2 p2 = new Personcls2("John","Yalala","7386270754",gender.M);
		p1.getDetails();
		p2.getDetails();
	}

}

