package two;
import java.util.*;
class Person{
	private String name;
	private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) throws Exception {
		if(age<=15)
			throw new Exception("age should be greater than 15");
		else
			this.age = age;
	}
}
class Account{
	private long accNum;
	protected double balance;
	Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	
	public Account(double balance, Person accHolder) {
		super();
		this.accNum = generateAccountNumber();
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amt) {
		balance = balance +amt;
	}
	public void withdraw(double amt) {
		if(balance-amt<500) {
			System.out.println("minimum balance should be 500");
		}
		else
			balance=balance - amt;
	}
	
	@Override
    public String toString() {
        return "Account Details:\n" +
                "Account Number: " + accNum + "\n" +
                "Account Holder Name: " + accHolder.getName() + "\n" +
                "Balance: INR " + balance;
    }
	private int generateAccountNumber() {
        Random rand = new Random();
        return rand.nextInt(900000) + 100000; // Generate a random 6-digit account number
    }
}
class SavingsAccount extends Account{

	public SavingsAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	final float minimum_Balance=500; 
	public void withdraw(double amt) {
		if(balance-amt<minimum_Balance) {
			System.out.println("minimum balance should be 500");
		}
		else
			balance=balance - amt;
	}
}
class CurrentAccount extends Account{

	public CurrentAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}
		boolean overdraft = false;
		public void withdraw(double amt) {
			if(balance-amt<0) {
				System.out.println(!overdraft);
			}
			else
				balance = balance - amt;
		}
	
}
public class TwoOne {
	public static void main(String args[]) {
	Person p1 = new Person();
	p1.setName("smith");
	try {
		p1.setAge(13);
		Account a1 = new Account(2000,p1);
		a1.deposit(2000);
		Person p2 = new Person();
		p2.setName("kathy");
		Account a2 = new Account(3000,p2);
		a2.withdraw(2000);
		System.out.println("smith balance:"+a1.getBalance());
		System.out.println("Kathy balance:"+a2.getBalance());
		System.out.println(a1);
		System.out.println(a2);
		Person p3 = new Person();
		p3.setName("Divya");
		Person p4 = new Person();
		p4.setName("john");
		CurrentAccount c1 = new CurrentAccount(3000,p3);
		SavingsAccount s1 = new SavingsAccount(4000,p4);
		c1.withdraw(3500);
		s1.withdraw(3600);
	}
	catch(Exception e) {
		System.err.println("Error: "+e.getMessage());
	}
		}
	}
