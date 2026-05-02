package Hospital_system;

public class Patientpannel {
	
	private String username;
	private int password;
	
	public Patientpannel() {
		// TODO Auto-generated constructor stub
	}
	
	public Patientpannel(String username, int password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	public boolean login(String user,int pass)
	{
		if(user.equals(getUsername())&&pass==getPassword())
		{
			System.out.println("Login Successfull!!!");
			return true;
		}
		return false;
	}
	

}
