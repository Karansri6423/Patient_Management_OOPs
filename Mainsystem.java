package Hospital_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainsystem {

	public static void main(String[] args) {

		List<Doctor> docli = new ArrayList<>();
		docli.add(new Doctor(1, "Dr.Ashok", "Cardiologist"));
		docli.add(new Doctor(2, "Dr.Pranav", "General Physician"));

		Scanner sc = new Scanner(System.in);
		Patientpannel p = new Patientpannel("Karankh", 1234);
		Appointment a = new Appointment();
		bill b = new bill();
		Doctorpannel dp = new Doctorpannel("dochelp", 5678);

		while (true) {
			System.out.println("----menu----");
			System.out.println("1.Patient");
			System.out.println("2.Doctor");
			System.out.println("");
			System.out.println("Choice your option: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter your user name: ");
				String user = sc.nextLine();
				System.out.println("Enter your password: ");
				int pass = sc.nextInt();
				sc.nextLine();
				System.out.println();
				if (p.login(user, pass)) {
					while (true) {

						System.out.println("1.Book Appointment");
						System.out.println("2.Appointment Details");
						System.out.println("3.Exit");
						System.out.println("choice you option: ");
						int choice1 = sc.nextInt();
						sc.nextLine();
						System.out.println();
						switch (choice1) {
						case 1:
							System.out.println("Enter your name: ");
							String name = sc.nextLine();
							patient pa = new patient(name);
							List<patient> plis = new ArrayList<>();
							plis.add(pa);

							System.out.println("choice the Doctor: ");
							for (Doctor d : docli) {
								System.out.println(d);
							}
							int id = sc.nextInt();

							Doctor selectdoctor = null;
							for (Doctor d : docli) {
								if (id == d.getDid()) {
									selectdoctor = d;
									break;
								}
							}
							Appointment.bookAppointment(pa, selectdoctor);
							System.out.println();
							break;

						case 2:
							Appointment.BookingDetails();
							System.out.println();
							break;
						case 3:
							System.out.println("ThankYou!!!Take care");
							break;

						}
						if (choice1 == 3)
							break;
					}
				}
				break;

			case 2:
				System.out.println("Enter the user name: ");
				String docuser = sc.nextLine();
				System.out.println("Enter your password: ");
				int dpass = sc.nextInt();
				sc.nextLine();
				System.out.println();
				if (dp.login(docuser, dpass)) {
					System.out.println("Choose your Sepcialization:");
					for (Doctor d : docli) {
						System.out.println(d.specialization);
					}
					System.out.println("Choose your ID: ");
					int id = sc.nextInt();
					System.out.println();
					Doctor SelectSpecialization = null;
					for (Doctor d : docli) {
						if (id == d.Did) {
							SelectSpecialization = d;
							break;
						}
					}
					Appointment.docBookingDetails(SelectSpecialization);
					System.out.println();

				}
				break;

			}
		}
	}
}
