package one;
class Person{
	private String firstName;
	private String lastName;
	private char gender;
	public Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) throws Exception {
			if(firstName == "")
			     throw new Exception ("first name is empty");
			else 
				this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) throws Exception{
		if(lastName == "") {
			throw new Exception("Last name is empty");
		}
		else {
		this.lastName = lastName;
		}
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}

public class OneSix {

	public static void main(String[] args) {
		try {
		Person p1 = new Person();
		p1.setFirstName("Divya");
		p1.setLastName("");
		p1.setGender('F');
		}
		catch(Exception e) {
			System.err.println("error: "+e.getMessage());;
		}
	}

}
