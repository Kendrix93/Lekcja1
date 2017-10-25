package training2.model;

public class User {
	
	public String rola;
	
	private String login;
	private String password;
	private String name;
	private String lastName;
	private String pesel;
	
	public User() {
		
	}

	public User(String login, String password, String name, String lastName) {
		this.login = login;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", name=" + name + ", lastName=" + lastName + "]";
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getRola() {
		return rola;
	}

	public void setRola(String rola) {
		this.rola = rola;
	}
}
