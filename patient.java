package Hospital_system;

public class patient {

	private int pid;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	private String Pname;

	public patient() {
		// TODO Auto-generated constructor stub
	}

	public patient(String pname) {
		super();

		Pname = pname;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	@Override
	public String toString() {
		return "patient [Pname=" + Pname + "]";
	}

}
