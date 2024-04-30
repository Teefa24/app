import java.util.ArrayList;

public class comments {
	
	private static  ArrayList<String> usersWhoCommented = new ArrayList<String>();
	private static  ArrayList<String> commentContents = new ArrayList<String>();
	
    static public void comment(String username, String comment) {
    	usersWhoCommented.add(username);
    	commentContents.add(comment);
    	
    }
    
    
    static public void deleteComment(String username, String comment) {
    	usersWhoCommented.remove(username);
    	commentContents.remove(comment);
    }
    
    static public void PrintComments() {
		System.out.println("\n comments ("+ usersWhoCommented.size() +")");
		
		for (int i=0; i< usersWhoCommented.size() ;i++) {
			System.out.println("\n	("+usersWhoCommented.get(i)+"):");
			System.out.println("	  "+commentContents.get(i));
		}
		
    }
	
	public static void main(String[] args) {
		
	}

}
