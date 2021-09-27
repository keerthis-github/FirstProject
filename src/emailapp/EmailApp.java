package emailapp;
import java.util.*;
public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email();

		System.out.println("select \nCreateEmail \nResetPassword \nSetAlternateEmail \nGetalternateEmail");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine().toLowerCase();
	
		switch(choice) {
		case "createemail": System.out.println("please enter the Firstname and lastname of the employee");
		                    String fname= sc.nextLine();
		                    String lname=sc.nextLine();
		                    Email em = new Email(fname,lname);
		                    break;
		case "resetpassword" : System.out.println("Please enter the password");
		                       String pwd = sc.nextLine();
		                      break;
		                      
		case "setalternateemail" : System.out.println("enter alternate email address");
		                           String email = sc.nextLine();
		                           em1.setAlternateEmail(email);
		                           break;
		                           
		case "getAlternateemail" : System.out.println("Alternate Email: "+em1.getAlternateEmail());
	                               break;
		                            
		default: System.out.println("please enter a correct choice");                  
		              System.exit(0);         
		}
	
		
		

	}

}
