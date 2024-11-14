import java.util.ArrayList;

public class AppointmentManager {
    private ArrayList<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();
    }

    // 创建预约
    public void createAppointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        Appointment appointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(appointment);
        System.out.println("Appointment created for " + patientName);
    }

    // 打印现有预约
    public void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        for (Appointment appointment : appointments) {
            appointment.printDetails();
            System.out.println("------------------------------");
        }
    }

    // 取消预约
    public void cancelBooking(String mobilePhone) {
        for (Appointment appointment : appointments) {
            if (appointment.getMobilePhone().equals(mobilePhone)) {
                appointments.remove(appointment);
                System.out.println("Appointment for mobile " + mobilePhone + " cancelled.");
                return;
            }
        }
        System.out.println("No appointment found with mobile number " + mobilePhone);
    }
}
