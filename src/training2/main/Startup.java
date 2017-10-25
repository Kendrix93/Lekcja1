package training2.main;

import training2.model.User;

public class Startup {

	public static void main(String[] args) {
		User user = new User(null, "v", "c", "d");
		User user2 = new User(null, "w", "c", "d");
		User user3 = new User(null, "e", "c", "d");
		User user4 = new User(null, "r", "c", "d");
		User user5 = new User(null, "g", "c", "d");
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);
		System.out.println(user5);
	}

}
