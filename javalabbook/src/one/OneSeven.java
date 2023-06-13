package one;
class Personcls{
	private String firstName;
	private String lastName;
	private char gender;
	private String phoneNum;
	Personcls(){
		System.out.println("default constructor");
	}
	public Personcls(String firstName, String lastName, char gender,String phoneNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNum = phoneNum;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void getDetails() {
		System.out.println("FirstName: "+firstName);
		System.out.println("LasttName: "+lastName);
		System.out.println("Gender: "+gender);
		System.out.println("PhoneNum: "+phoneNum);
	}
}

public class OneSeven {

	public static void main(String[] args) {
		Personcls p1 = new Personcls("Divya","Yalala",'F',"7386270454");
		p1.getDetails();	
	}

}

