package Hospital_system;

public class Doctor {

	protected int Did;
	protected String Dname;
	protected String specialization;

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(int did, String dname, String specialization) {
		super();
		Did = did;
		Dname = dname;
		this.specialization = specialization;
	}

	public int getDid() {
		return Did;
	}

	public void setDid(int did) {
		Did = did;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Doctor [Did=" + Did + ", Dname=" + Dname + ", specialization=" + specialization + "]";
	}

	public boolean isAvailable() {
		return false;

	}

}
