package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private int mailboxcapacity = 1000;
	private int defaultpwdlength=10;
	private String alternateEmail;
	private String companydomain = "company.com";
	
	
	public Email()
	{
		//
	}
	//constructore to recive the firstnam and last name 
	public Email(String firstName,String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		
		//call a method to set random passwords
		password = randomPassword(defaultpwdlength);
		email = lastName.toLowerCase()+firstName.toLowerCase()+"@"+department+"_"+companydomain;
		System.out.println("Email id : "+email);
		System.out.println("Password : "+password);
		
	}
	
	
	//ask for the department
	private String setDepartment() {
		System.out.println("please enter the department\n1 for sales\n2 for development\n3 for testing\n0 for nothing  ");
		Scanner sc = new Scanner(System.in);
		int depno = sc.nextInt();
		if (depno == 1)
		{
			return "sales";
		}
		else if(depno == 2) {
			return "development";}
		else if (depno == 3) {
			return "Testing";}
		else return "";
		
	}
	
	 //Generate random passwords
	
	private String randomPassword(int length)
	{
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@$!%*";
		char password[] = new char[length];
		for(int i=0;i<length;i++)
		{
			int rand = (int)(Math.random() * passwordset.length());
			password[i]= passwordset.charAt(rand);
		}
		return new String(password);
	}
	//firstname.lastname@dept.company.com
	//set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxcapacity=capacity;
	}
	
	//set the alternate email 
	public void setAlternateEmail(String email)
	{
		this.alternateEmail = email;
	}
	
	
	//change the passwords
	public void changePassword(String pwd)
	{
		this.password=pwd;
		System.out.println("New Password is"+this.password);
	}
	
	public int getMailBoxCapacity() {
		return mailboxcapacity;
	}
	
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	
	

}
