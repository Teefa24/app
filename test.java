import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		/*
		User mohamed = new User("mohamed", "123456", "mohamedname","lastname", "i am mohamed basha"," ", "https://twitter.com/MoSalah/header_photo");
		User ahmed = new User("ahmed", "123456", "ahmedname", "i am ahmed basha"," "," ", "https://twitter.com/MoSalah/header_photo");		
		
		
		System.out.println("post 1:");
		Post x = new Post("Aloooo", mohamed);
		
		x.likePost(ahmed);
		x.likePost(mohamed);
		x.comment(ahmed, "ay 7aga");

		x.comment(mohamed, "ay 7agaa");
		//x.deleteComment(mohamed, "ay 7aga");
		x.print();
		x.printDetails();
	
	/*	System.out.println("post 2:");

		post y = new post("kosom el 5ara", "abdelrahman");
		
		y.likePost("ahmad");
		y.likePost("abdelrahman");
		y.likePost("mohammed");
		y.unlikePost("ahmad");
		y.comment("ahmad", "ay 7aga");
		y.comment("abdelrahman", "ay 7agaa");
		y.comment("mohammed", "ay 7agaa");
		y.deleteComment("mohammed", "ay 7aga");
		y.print();
		y.printDetails();
		
		 /*
	


		 ahmed.addFriend(mohamed);
		    System.out.println(ahmed.getusername());
		    System.out.println(ahmed.getpassword());
		    System.out.println(ahmed.getname());
		    System.out.println(ahmed.getbio());
		    System.out.println(ahmed.getprofilepicture());
		    */
		
	   /// Scanner input = new Scanner (System.in);
	  //  Register first = new Register(input);
	   /// Login firstagain = new Login(input);

		Scanner input = new Scanner (System.in);
		Register first = new Register(input);
	    Login firstagain = new Login( input );

		for (User user : Database.Users) {
			String username = user.getUsername();
			System.out.println(username);
		}
		for (User user : Database.Users) {
			user.setUsername("basha");
		}
		for (User user : Database.Users) {
			String username = user.getUsername();
			System.out.println(username);
		}


		
		
		for (User user : Database.Users) {
			String bio = user.getBio();
			System.out.println(bio);
		}
		for (User user : Database.Users) {
			user.setBio("basha");
		}
		for (User user : Database.Users) {
			String bio = user.getBio();
			System.out.println(bio);
		}

	    //firstagain.insertDatalogin( third );
	   


	}

}
