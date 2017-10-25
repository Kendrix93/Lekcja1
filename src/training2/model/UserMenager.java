package training2.model;

public class UserMenager {
	
	static User user = new User();
	 
	void Start() {
	
	}

	public static void main(String[] args) {
		switch(user.rola) {
		case "Admin":
		// Lista akcji
			break;
		case "Student":
		// Lista akcji
			break;
		case "Wykladowca":
		// Lista akcji
			break;
		}
	}

	public static User getUser() {
		return user;
	}

	public static void setUser(User user) {
		UserMenager.user = user;
	}

	@Override
	public String toString() {
		return "UserMenager [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
