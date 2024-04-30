import java.util.ArrayList;

public class likes {
	
	private static  ArrayList<String> usersWhoLiked = new ArrayList<String>();
	
	static public void likePost(String username) {
		
		usersWhoLiked.add(username);
		
	}
	
	static public void unlikePost(String username) {
		usersWhoLiked.remove(username);
		
	
	}
	
	static public void printLikes() {
		

		System.out.println("\nlike count : "+usersWhoLiked.size());
		System.out.println("\nusers that liked: ");
		for (int i=0; i< usersWhoLiked.size() ;i++) {
			System.out.println("\n	"+usersWhoLiked.get(i));
		}
	}
	
	static public int getLikeCount() {
		return usersWhoLiked.size();
	}
	
	public static void main(String[] args) {
		
	}
}
