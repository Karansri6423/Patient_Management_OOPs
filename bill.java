package Hospital_system;

public class bill {

	patient p;
	Doctor d;

	public bill() {
		// TODO Auto-generated constructor stub
	}

	public bill(patient p, Doctor d) {
		super();
		this.p = p;
		this.d = d;
	}

	public void generateBill(String pname, String dname, double price) {
		System.out.println("-----Bill-----");
		System.out.println("Patient name: " + pname);
		System.out.println("Treated By: " + dname);
		System.out.println("Consultant Fee: " + price);
	}

}
