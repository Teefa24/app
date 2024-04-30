
	import java.util.Scanner;

	public class Login {

		   Scanner input;
		   String email2;
		   String pass2;
		    
		    Login (  Scanner input ) {
		    this.input=input;
		    insertDatalogin ( );
		  }
		  
		  public void insertDatalogin() {
		    System.out.println("Enter Email:");
		    email2=input.nextLine();
		         
		    System.out.println("Enter Password:");
		    pass2=input.nextLine();  
		    
		    validationlogin ();
		  }
		    
		   public void validationlogin () { 
		    
		    for ( int k=0; k<Register.i;k++ ) {
		        if ( Register.getEmails().contains(email2))  {
		            if (Register.getPasswords().contains(pass2))  {
		                System.out.println("Successful login");
		                return;
		            }
		        }
		       
		    } 
		    
		            System.out.println("Wrong input please try again\n ");
		            insertDatalogin ();

		       
		        
		      
		  }
	}

