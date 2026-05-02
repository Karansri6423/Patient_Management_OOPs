package Hospital_system;

public class Doctorpannel {

	private String user;
	private int pass;

	public Doctorpannel() {
		// TODO Auto-generated constructor stub
	}

	public Doctorpannel(String user, int pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public boolean login(String user, int password) {
		if (user.equals(getUser()) && pass == password) {
			System.out.println("Login Successfull!!!");
			System.out.println();
			return true;
		}
		return false;
	}

	public void getBookings(Doctor doctor) {
		Appointment.docBookingDetails(doctor);
	}

}
