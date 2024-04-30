	import java.util.Scanner;
	import java.util.regex.*;    
	import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

	
public class Register {

		  static Scanner input;
		  String username;
		  String pass;  
		  String email;
		  static User newUser = new User();
	      //Regular Expression   
	      String regex = "^[\\w!#$%&'*+/=?{|}~^-]+(?:\\.[\\w!#$%&'*+/=?{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";  
	      //Compile regular expression to get the pattern  
	      Pattern pattern = Pattern.compile(regex);  
	      //Iterate emails array list  
		  //static ArrayList<String> emails = new ArrayList<String>(); 
	      private static  ArrayList<String> emails = new ArrayList<String>();
	      private static  ArrayList<String> usernames = new ArrayList<String>();
	      private static  ArrayList<String> passwords = new ArrayList<String>();
		  public static int i=0;
		  
		  
		  public Register (Scanner input){
		    this.input=input;
		    insertData();
		    
		  }

		  public void insertData(){
			  
			System.out.println("Enter First Name:");
			newUser.setFirstname(input.nextLine());
			
			System.out.println("Enter Last Name:");
			newUser.setLastname(input.nextLine());
			
			
		    System.out.println("Enter Username:");
		    usernames.add(username);
		    newUser.setUsername(input.nextLine());
		    
			System.out.println("Enter Birthdate:");		
		    newUser.setBirthDate(input.nextLine());
		    
		    System.out.println("Enter Email:");
		    email = input.nextLine();
		    emails.add(email);
		    newUser.setEmail(email);
		    
		    System.out.println("Enter Password:");
		    pass = input.nextLine();
		    
		    newUser.setPassword(pass);
		    
		    passwords.add(pass);
		    validation();
		     i++; 
		     
		     
		     
			User TempUser = newUser;
			Database.Users.add(TempUser);
			newUser.setBio("Enter your bio");
			
		  }
		  
		  public int validation()
		    {
			  Matcher matcher = pattern.matcher(email);
		      if (i==0){if ( matcher.matches()== false ) {
		            System.out.println("Wrong Email please try again\n");  
		            insertData();

		      }
		      else if(  pass.length()<8 || Character.isUpperCase(pass.charAt(0))== false ) {
			       System.out.println("Wrong Password please try again\n");
			       insertData();
			       return 0;
		      }

		   }
			  
		      for(int j=0;j<i;j++ )                  {
		      if ( pass.length()<8 || Character.isUpperCase(pass.charAt(0))== false)
		      {
		       System.out.println("Wrong Password please try again\n");
		       insertData();
		       return 0;
		       //break; 
		      }
		      else if (passwords.contains(newUser.getPassword()))
		      {
		        System.out.println("Password already used please try again\n");
		        //emails.remove(i);
		        insertData();
		        return 0;
		       // break; 
		      }
		      else if ( emails.contains(newUser.getEmail()))
		      {
		        System.out.println("Email already used please try again\n");
		        //emails.remove(j);
		        insertData();
		        return 0;
		       // break; 
		      }
		      else if ( matcher.matches()== false ) {
		            System.out.println("Wrong Email please try again\n");  
			        //emails.remove(i);
		            insertData();
		            return 0;
		      }
		    
		      
		      }

		       System.out.println("Successfully Registered\n");
		      // break;
		       return 0;
		      } 
		    public User getNewUser() {
		    	return newUser;
		    }
		    
		    public static List<String> getEmails() {
		        return emails;
		    }

		  
		    public static List<String> getPasswords() {
		        return passwords;
		    }
		    
		  
	/*	  public static void emailvalidate(){  

		        //Regular Expression   
		        String regex = "^[\\w!#$%&'*+/=?{|}~^-]+(?:\\.[\\w!#$%&'*+/=?{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";  
		        //Compile regular expression to get the pattern  
		        Pattern pattern = Pattern.compile(regex);  
		        //Iterate emails array list  
		        for(String email : emails){  
		            //Create instance of matcher   
		            Matcher matcher = pattern.matcher(email);  
		            System.out.println(email +" : "+ matcher.matches()+"\n");  
		        }  
		    }  
		  */
		  

	}

