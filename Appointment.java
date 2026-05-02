package Hospital_system;

import java.util.ArrayList;
import java.util.List;

public class Appointment {

	patient p;
	Doctor d;

	static List<Appointment> app = new ArrayList<>();

	public Appointment() {
		// TODO Auto-generated constructor stub
	}

	public Appointment(patient p, Doctor d) {
		super();
		this.p = p;
		this.d = d;
	}

	public static boolean bookAppointment(patient p, Doctor d) {
		Appointment a = new Appointment(p, d);
		app.add(a);
		System.out.println("Appointment Booking Successfull!!!");
		return true;
	}

	public static void BookingDetails() {
		if (app.isEmpty()) {
			System.out.println("No booking done yet");
			return;
		}
		System.out.println("-----Booking Deatils-----");
		for (Appointment a : app) {
			System.out.println("1.Patient name: " + a.p.getPname());
			System.out.println("2.Doctor name: " + a.d.getDname());
			System.out.println("3.Specialization: " + a.d.getSpecialization());
			System.out.println();
		}

	}

	public static void docBookingDetails(Doctor selectedDoctor) {
		boolean found = false;
		System.out.println("-----Patient list-----");
		for (Appointment a : app) {

			if (a.d.getDid() == selectedDoctor.Did) {

				System.out.println(a.p.getPname());
				found = true;
			}
		}
		if (!found) {
			System.out.println("No patients ");
		}
	}
}
