# 🏥 Hospital Management System (Java Console Project)

## 📌 Overview

This is a **Java-based console application** that simulates a basic Hospital Management System.
It allows patients to book appointments and doctors to view their assigned patients based on their specialization or ID.

---

## 🚀 Features

### 👤 Patient Module

* Patient login authentication
* Book appointment with available doctors
* View appointment details

### 👨‍⚕️ Doctor Module

* Doctor login authentication
* View only assigned patients
* Filtering based on:

  * Doctor ID ✅ (recommended)
  * Specialization

### 📋 Appointment Management

* Store all appointments using `ArrayList`
* Display booking details
* Link patient with doctor

---

## 🛠️ Technologies Used

* Java (Core Java)
* OOP Concepts:

  * Encapsulation
  * Classes & Objects
  * Method Calling
* Collections (`ArrayList`)
* Scanner (for user input)

---

## 📂 Project Structure

```
Hospital_system/
│
├── Mainsystem.java        # Main driver class
├── Appointment.java       # Appointment handling
├── Doctor.java            # Doctor model class
├── patient.java           # Patient model class
├── Patientpannel.java     # Patient login system
├── Doctorpannel.java      # Doctor login system
├── bill.java              # Billing (basic structure)
```

---

## 🔄 Workflow

### 🧑 Patient Flow:

1. Login with username & password
2. Choose doctor from list
3. Book appointment
4. View booking details

### 👨‍⚕️ Doctor Flow:

1. Login with credentials
2. Select doctor ID
3. View only assigned patients

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/hospital-management-system.git
   ```

2. Open in any IDE (Eclipse / IntelliJ / VS Code)

3. Run:

   ```
   Mainsystem.java
   ```

---

## ⚠️ Important Notes

* Data is stored in-memory (no database used)
* App is console-based (no GUI)
* Doctor filtering works best using **Doctor ID (unique)**

---

## 💡 Future Improvements

* ✅ Add database (MySQL)
* ✅ GUI using JavaFX / Swing
* ✅ Appointment time & date
* ✅ Billing automation
* ✅ Admin panel
* ✅ Multiple users

---

## 📸 Sample Output

```
----menu----
1.Patient

Enter your user name:
Enter your password:

1.Book Appointment
2.Appointment Details
3.Exit
```

---

## 🤝 Contribution

Feel free to fork this project and improve it. Suggestions are welcome!

---

## 📜 License

This project is for educational purposes.

---

## 🙌 Author

**Karan Khabale**
